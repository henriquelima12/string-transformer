package com.datahub.stringtranformer.service;

import com.datahub.stringtranformer.entity.StringTransformer;
import com.datahub.stringtranformer.repository.StringTransformerRepository;
import com.datahub.stringtranformer.util.StringTransformerUtil;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StringTransformerService {

    @Autowired
    private StringTransformerRepository stringTransformerRepository;

    public String salvarString(String string) {
        StringTransformer stringTransformer = new StringTransformer(string);
        stringTransformerRepository.save(stringTransformer);
        return StringTransformerUtil.inverterString(stringTransformer);
    }

}
