package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Color;
import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.model.Style;
import com.color.finalsprints4.model.Vibe;
import com.color.finalsprints4.repository.ColorRepository;
import com.color.finalsprints4.repository.SpaceRepository;
import com.color.finalsprints4.repository.StyleRepository;
import com.color.finalsprints4.repository.VibeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ColorServiceTest {

    @Mock
    private ColorRepository colorRepository;

    @Mock
    private SpaceRepository spaceRepository;

    @Mock
    private StyleRepository styleRepository;

    @Mock
    private VibeRepository vibeRepository;

    @InjectMocks
    private ColorService colorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllColors() {
        List<Color> colors = Arrays.asList(new Color(), new Color());
        when(colorRepository.findAll()).thenReturn(colors);
        List<Color> result = colorService.getAllColors();
        assertEquals(colors, result);
    }

    @Test
    void testAddColor() {
        Color color = new Color();
        when(colorRepository.save(color)).thenReturn(color);
        Color result = colorService.addColor(color);
        assertEquals(color, result);
    }

    @Test
    void testGetColorById() {
        Color color = new Color();
        when(colorRepository.findById(1L)).thenReturn(Optional.of(color));
        Color result = colorService.getColorById(1L);
        assertEquals(color, result);
    }

    @Test
    void testGetUserColor() {
        List<Long> vibeIds = Arrays.asList(1L, 2L);
        Long spaceId = 1L;
        Long styleId = 2L;

        List<Color> colors = Arrays.asList(new Color());
        when(colorRepository.findBySpaceIdAndStyleId(spaceId, styleId)).thenReturn(colors);

        Set<Vibe> vibes = new HashSet<>();
        when(vibeRepository.findById(1L)).thenReturn(Optional.of(new Vibe()));
        when(vibeRepository.findById(2L)).thenReturn(Optional.of(new Vibe()));

        Color bestColor = new Color();
        when(colorRepository.findBySpaceIdAndStyleId(spaceId, styleId)).thenReturn(Collections.singletonList(bestColor));
        Optional<Color> result = colorService.getUserColor(vibeIds, spaceId, styleId);
        assertTrue(result.isPresent());
        assertEquals(bestColor, result.get());
    }

    @Test
    void testUpdateColor() {
        Color existingColor = new Color();
        existingColor.setId(1L);
        Color updatedColor = new Color();
        updatedColor.setId(1L);

        when(colorRepository.findById(1L)).thenReturn(Optional.of(existingColor));
        when(colorRepository.save(existingColor)).thenReturn(existingColor);

        Color result = colorService.updateColor(1L, updatedColor);
        assertEquals(existingColor, result);
    }

    @Test
    void testDeleteColor() {
        doNothing().when(colorRepository).deleteById(1L);
        colorService.deleteColor(1L);
        verify(colorRepository, times(1)).deleteById(1L);
    }
}


