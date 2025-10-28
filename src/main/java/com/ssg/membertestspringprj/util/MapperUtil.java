//package com.ssg.membertestspringprj.util;
//
//import org.modelmapper.ModelMapper;
//import org.modelmapper.convention.MatchingStrategies;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MapperUtil {
//
//    @Bean
//    public ModelMapper modelMapper() {
//        ModelMapper modelMapper = new ModelMapper();
//                // 필드를 비교할 수 있게 할지
//        modelMapper.getConfiguration().setFieldMatchingEnabled(true)
//                // 비교를 위한 접근제한자를 어디까지 허용할껀지
//                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
//                // 필드명이 같은지
//                .setMatchingStrategy(MatchingStrategies.STRICT);
//        return modelMapper;
//    }
//}
