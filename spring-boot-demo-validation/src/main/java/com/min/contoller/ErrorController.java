package com.min.contoller;


import com.min.bean.Song;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ErrorController {

    @RequestMapping("/val")
    public String testVal(@Valid Song song, BindingResult result){
        if(result.getErrorCount() > 0 ){
            List<FieldError> list = result.getFieldErrors();
            StringBuffer buffer = new StringBuffer();
            list.forEach(
                    p-> {
                        buffer.append(p.getField());
                        buffer.append("\t");
                        buffer.append(p.getDefaultMessage());
                        buffer.append("\n");
                    }
            );
            return buffer.toString();
        }
        System.out.println(song);
        return "success";
    }

    @RequestMapping("/error404")
    public String error(){
        return "sorry, this is error";
    }

    @RequestMapping("testError")
    public String testError() throws Exception {
        throw new Exception("出错了!!!!");
    }
}
