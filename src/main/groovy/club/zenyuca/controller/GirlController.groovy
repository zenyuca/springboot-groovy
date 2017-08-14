package club.zenyuca.controller

import club.zenyuca.common.result.ResultUtil
import club.zenyuca.entity.Girl
import club.zenyuca.common.result.Result
import club.zenyuca.service.GirlService
import org.hibernate.cfg.BinderHelper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

import javax.validation.Valid

@RestController
class GirlController {

    @Autowired
    GirlService girlService

    @GetMapping(value = "/girls")
    Result girls() {
        return ResultUtil.success(this.girlService.getGirls())
    }

    @DeleteMapping(value = "/girl/{id}")
    Result delGirl(@PathVariable(value = "id") Integer id) {
        this.girlService.delGirl(id)
        return ResultUtil.success()
    }

    @PostMapping(value = "/girl")
    Result addGirl(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(100, bindingResult.getFieldError().getDefaultMessage())
        }
        return ResultUtil.success(this.girlService.addGirl(girl))
    }

    @PutMapping(value = "/girl/{id}")
    Result updateGirl(@PathVariable(value = "id") Integer id, Integer age, String name) {
        Girl girl = new Girl()
        girl.id = id
        girl.age = age
        girl.name = name
        return ResultUtil.success(this.girlService.updateGirl(girl))
    }

    @GetMapping(value = "/girl/{id}")
    Result getGirl(@PathVariable(value = "id") Integer id) {
        return ResultUtil.success(this.girlService.getById(id))
    }

}
