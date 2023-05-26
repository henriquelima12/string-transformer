package com.datahub.stringtranformer.util;

import com.datahub.stringtranformer.entity.StringTransformer;

import java.text.Normalizer;

public class StringTransformerUtil {

    public static String inverterString(StringTransformer stringTransformer) {
        if (!Normalizer.isNormalized(stringTransformer.getOriginalString(), Normalizer.Form.NFC)) {
            stringTransformer.setOriginalString(Normalizer.normalize(stringTransformer.getOriginalString(), Normalizer.Form.NFC));
        }
        stringTransformer.setOriginalString(new StringBuilder(stringTransformer.getOriginalString()).reverse().toString());
        return stringTransformer.getOriginalString();
    }

}
