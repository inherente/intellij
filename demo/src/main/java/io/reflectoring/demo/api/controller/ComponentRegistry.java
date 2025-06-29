package io.reflectoring.demo.api.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Component
public class ComponentRegistry implements ApplicationContextAware {
    private Map<String, Object> componentMap;
    private ApplicationContext applicationContext;

    Logger logger = Logger.getLogger(ComponentRegistry.class.getName());
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }
    @PostConstruct
    public void initComponentMap() throws BeansException {
        componentMap = applicationContext.getBeansWithAnnotation(Service.class);

    }

    public void init() throws BeansException {
        ConfigurableListableBeanFactory beanFactory = (ConfigurableListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();
        BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) beanFactory;
        SingletonBeanRegistry singletonBeanRegistry = (SingletonBeanRegistry) beanFactory;

        componentMap = new HashMap<>();

        String[] beanNames = beanFactory.getBeanNamesForType(Object.class);
        for (String beanName : beanNames) {
            BeanDefinition beanDefinition = beanDefinitionRegistry.getBeanDefinition(beanName);
            String beanClassName = beanDefinition.getBeanClassName();
            if (beanClassName == null) {
                logger.warning(String.format("beanClassName is null for beanName: %s", beanName));
                continue;
            }
            if (beanClassName.startsWith("io.reflectoring.demo.api.task")) {
                Object bean = singletonBeanRegistry.getSingleton(beanName);
                componentMap.put(beanName, bean);
            }
        }
        logger.info( String.format("componentMap: is %d item(s) long.", componentMap.size()));
    }
    public List<String> getBeanNameCollection() {
        return componentMap.keySet().stream()
                .collect(Collectors.toList());
    }
    public Map<String, Object> getComponentMap() {
        return componentMap;
    }
}
