package club.zenyuca.common.result

class ResultUtil {
    static Result success(data) {
        Result result = new Result()
        result.code = 0
        result.msg = "成功"
        result.data = data
        return result
    }

    static Result success() {
        return success("")
    }
    
    static error(code, msg) {
        Result result = new Result()
        result.code = code
        result.msg = msg
        result.data = ""
        return result
    }
}
