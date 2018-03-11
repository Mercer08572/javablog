package xyz.fallenicarus.indexPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Badbugu17 at 2018/2/22 18:26.
 */
@Controller
public class pageController {

    /*
    首页
     */
    @RequestMapping("/")
    public String indexPage(){
        return "index";
    }

    /*
    markdown编辑器
     */
    @RequestMapping("/MarkdownEditor/markdownEditor")
    public String markdownEditor(){
        return "./MarkdownEditor/markdownEditor";
    }

}
