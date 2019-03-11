package com.yezi.luframe.controller.mongodb;

import com.yezi.luframe.mongodb.AdminUserOperateLog;
import com.yezi.luframe.mongodb.service.AdminUserOperateLogService;
import com.yezi.luframe.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yezi
 * @date 2019/3/11 15:10
 */
@RestController
public class AdminUserOperateLogController {

    @Autowired
    AdminUserOperateLogService operateLogService;

    /**
     * 保存用户操作日志
     *
     * @param operateLog
     * @return
     */
    @PostMapping("/mongodb/log/add")
    public JsonResult addAdminUserOperateLog(@RequestBody AdminUserOperateLog operateLog) {
        return new JsonResult().OK(operateLogService.addAdminUserOperateLog(operateLog));
    }

    /**
     * 更新用户操作日志
     *
     * @param operateLog
     * @return
     */
    @PutMapping("/mongodb/log/update")
    public JsonResult updateAdminUserOperateLog(@RequestBody AdminUserOperateLog operateLog) {
        return new JsonResult().OK(operateLogService.updateAdminUserOperateLog(operateLog));
    }

    /**
     * 根据id查找用户操作日志
     *
     * @param id
     * @return
     */
    @GetMapping("/mongodb/log/{id}")
    public JsonResult findAdminUserOperateLogById(@PathVariable("id") String id) {
        return new JsonResult().OK(operateLogService.findAdminUserOperateLogById(id));
    }

    /**
     * 根据id删除用户操作日志
     *
     * @param id
     */
    @DeleteMapping("/mongodb/log/{id}")
    public JsonResult deleteAdminUserOperateLogById(@PathVariable("id") String id) {
        operateLogService.deleteAdminUserOperateLog(id);
        return new JsonResult().OK();
    }

    /**
     * 查询所有用户操作日志
     *
     * @return
     */
    @GetMapping("/mongodb/log/list")
    public JsonResult findAllAdminUserOperateLog() {
        return new JsonResult().OK(operateLogService.findAllAdminUserOperateLog());
    }

}
