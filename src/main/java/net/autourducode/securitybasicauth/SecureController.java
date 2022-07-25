package net.autourducode.securitybasicauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author autourducode
 */
@RestController
public class SecureController {

    @GetMapping("/user")
    public String loginUser()
    {
        return "L'utilisateur s'est connecté avec succès !!!";

    }

    @GetMapping("/admin")
    public String loginAdmin()
    {
        return "L'administrateur s'est connecté avec succès !!!";
    }
}
