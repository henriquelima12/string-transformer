package com.datahub.stringtranformer.repository;

import com.datahub.stringtranformer.entity.StringTransformer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StringTransformerRepository extends JpaRepository<StringTransformer, Long> {

}
