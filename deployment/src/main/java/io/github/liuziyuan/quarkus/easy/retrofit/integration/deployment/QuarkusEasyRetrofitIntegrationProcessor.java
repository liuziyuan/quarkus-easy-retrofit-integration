package io.github.liuziyuan.quarkus.easy.retrofit.integration.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class QuarkusEasyRetrofitIntegrationProcessor {

    private static final String FEATURE = "quarkus-easy-retrofit-integration";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
