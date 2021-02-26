package dhbw.vs.uebungsblatt2bankservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @GetMapping
    public double getBaukreditzinssatz() {
        return 0.9;
    }

}
