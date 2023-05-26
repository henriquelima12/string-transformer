package com.datahub.stringtranformer.util;

import com.datahub.stringtranformer.entity.StringTransformer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StringTransformerUtilTests {

    private StringTransformer stringTransformer;

    @BeforeEach
    public void inicializar() {
        stringTransformer = new StringTransformer("");
    }

    @Test
    public void shouldReverseStringWithoutAccent() {
        stringTransformer.setOriginalString("casa");
        assertEquals("asac", StringTransformerUtil.inverterString(stringTransformer));
    }

    @Test
    public void shouldReverseStringWithAccent() {
        stringTransformer.setOriginalString("ímãs");
        assertEquals("sãmí", StringTransformerUtil.inverterString(stringTransformer));
    }

    @Test
    public void shouldNotReverseStringWithAccent() {
        stringTransformer.setOriginalString("sótão");
        assertNotEquals("oátõs", StringTransformerUtil.inverterString(stringTransformer));
    }

}
