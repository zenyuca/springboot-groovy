package club.zenyuca.common.exception

import club.zenyuca.common.result.Result
import club.zenyuca.common.result.ResultUtil
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody

@ControllerAdvice
class ExceptionHandle {

    static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class)

    @ExceptionHandler
    @ResponseBody
    Result handle(Exception e) {
        logger.error("[异常信息]: {}", e.getMessage())
        return ResultUtil.error(-1, "未知错误")
    }

    @ModelAttribute
    void init() {
        logger.info("Hello Yuca")
    }
}
