# Getting Started

## Lazy initialization of beans

To improve the startup time it is possible to lazily initialize the beans with an entry in the application.properties.

```
spring.main.lazy-initialization=true
```

Advantage:
- Faster startup
- Only initialize beans which are actually used

Disadvantage:
- Slower first time response since beans are created when they are needed.

Additional remark:
- Regarding the initialization of beans that are used, there are other mechanics to only create beans, which are needed. This can also be achieved with configuration, which would be the better way of doing it.