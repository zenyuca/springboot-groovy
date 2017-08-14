package club.zenyuca.aspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Aspect
@Component
class HttpAspect {

    static final Logger logger = LoggerFactory.getLogger(HttpAspect.class)

    @Pointcut(value = "execution(public * club.zenyuca.controller.*.*(..))")
    void log() {
    }

    @Before(value = "log()")
    void doBefore(JoinPoint joinPoint) {
        logger.info("参数：{}", joinPoint.getArgs())
    }

    @After(value = "log()")
    void doAfter() {
        logger.info("我走了")
    }

    @AfterReturning(pointcut = "log()", returning = "object")
    void doReturn(Object object) {
        logger.info("返回：{}", object.toString())
    }
}
