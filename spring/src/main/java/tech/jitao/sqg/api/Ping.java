package tech.jitao.sqg.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(Ping.PATH)
public class Ping {
    static final String PATH = "/ping";

    @GetMapping(PATH)
    public String process() {
        return "pong";
    }
}
