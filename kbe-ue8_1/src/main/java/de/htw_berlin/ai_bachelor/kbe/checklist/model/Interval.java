package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created on 11/01/16.
 */
@ApplicationScoped
@ManagedBean
public class Interval {
    @NotNull @Min(1)
    Integer maxInterval = 1;

    public Integer getMaxInterval() {
        return maxInterval;
    }

    public void setMaxInterval(Integer maxInterval) {
        this.maxInterval = maxInterval;
    }
}
