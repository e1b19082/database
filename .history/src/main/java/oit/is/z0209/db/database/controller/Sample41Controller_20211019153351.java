package oit.is.z0209.db.database.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.inudaisuki.springboot_samples.model.Chamber;
import oit.is.inudaisuki.springboot_samples.model.ChamberMapper;
//import oit.is.inudaisuki.springboot_samples.model.ChamberUser;
//import oit.is.inudaisuki.springboot_samples.model.UserInfo;

@Controller
@RequestMapping("/sample4")
public class Sample41Controller {

    @GetMapping("step1")
    public String sample41() {
      return "sample41.html";
    }

    /**
   * 指定したidをPATHパラメータで受け取り，そのidに対応するデータを取得して返す
   *
   * @param id
   * @param model
   * @return
   */
  @GetMapping("step2/{id}")
  public String sample42(@PathVariable Integer id, ModelMap model) {
    Chamber chamber2 = chamberMapper.selectById(id);
    model.addAttribute("chamber2", chamber2);

    return "sample41.html";
  }
    
}