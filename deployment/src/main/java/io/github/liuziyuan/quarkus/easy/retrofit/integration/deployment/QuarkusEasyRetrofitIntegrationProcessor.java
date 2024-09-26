package io.github.liuziyuan.quarkus.easy.retrofit.integration.deployment;

import io.github.liuziyuan.quarkus.easy.retrofit.integration.runtime.PrintInterceptor;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class QuarkusEasyRetrofitIntegrationProcessor {

    private static final String FEATURE = "quarkus-easy-retrofit-integration";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    public AdditionalBeanBuildItem registerMyCustomBean() {
        return AdditionalBeanBuildItem.unremovableOf(PrintInterceptor.class);
    }
}
