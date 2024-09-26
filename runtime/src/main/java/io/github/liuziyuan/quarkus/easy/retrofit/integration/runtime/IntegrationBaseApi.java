package io.github.liuziyuan.quarkus.easy.retrofit.integration.runtime;

import io.github.easyretrofit.core.annotation.RetrofitBuilder;

@RetrofitBuilder(baseUrl = "${integration.baseUrl}",
        addCallAdapterFactory = {BodyCallAdapterFactoryBuilder.class, GuavaCallAdapterFactoryBuilder.class},
        addConverterFactory = {JacksonConvertFactoryBuilder.class})
public interface IntegrationBaseApi {
}
