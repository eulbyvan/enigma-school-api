package com.enigmacamp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

@Configuration
public class SpringConfig {
 @Bean
 public ModelMapper modelMapper() {
  ModelMapper mp = new ModelMapper();
  return mp;
 }
}