package net.vivin.regula.validation.service.testcaseclass;

import javax.validation.Valid;

public class PojoWithCascadedConstraints {

    @Valid
    private PojoWithConstraints firstPojoWithConstraints;

    @Valid
    private PojoWithConstraints secondPojoWithConstraints;
}
