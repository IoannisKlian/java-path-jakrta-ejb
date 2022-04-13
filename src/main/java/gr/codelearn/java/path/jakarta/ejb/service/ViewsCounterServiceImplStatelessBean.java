/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codelearn.java.path.jakarta.ejb.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author giannis
 */
@Slf4j
@Stateless
public class ViewsCounterServiceImplStatelessBean implements ViewsCounterService {

    private Integer numberOfViews;

    @PostConstruct
    private void init() {
        numberOfViews = 0;
        log.info("Class {} has been intiliazed", getClass().getName());
    }

    @PreDestroy
    private void destroy() {
        log.info("Class {} is being destroyed", getClass().getName());
    }

    @Override
    public Integer getNumOfViews() {
        return numberOfViews;
    }

    @Override
    public void incrementNumberOfViews() {
        numberOfViews++;
        log.info("Views Class {} incremented to total {}", getClass().getName(),numberOfViews);
    }

}
