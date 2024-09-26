package io.github.liuziyuan.quarkus.easy.retrofit.integration.runtime;

import io.github.easyretrofit.core.builder.BaseConverterFactoryBuilder;
import retrofit2.Converter;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * @author liuziyuan
 */
public class JacksonConvertFactoryBuilder extends BaseConverterFactoryBuilder {

    @Override
    public Converter.Factory buildConverterFactory() {
        return JacksonConverterFactory.create();
    }
}
