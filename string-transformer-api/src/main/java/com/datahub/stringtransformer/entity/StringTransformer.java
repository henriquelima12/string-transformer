package com.datahub.stringtranformer.entity;

import jakarta.persistence.*;

@Entity
@Table(name="demos")
public class StringTransformer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, length = 200)
    private String originalString;

    public StringTransformer(String originalString) {
        this.originalString = originalString;
    }

    public String getOriginalString() {
        return originalString;
    }

    public void setOriginalString(String originalString) {
        this.originalString = originalString;
    }
}
