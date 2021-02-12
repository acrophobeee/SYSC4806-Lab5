package app.servingwebcontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuddyRestController {
    @Autowired
    private BuddyInfoRepository repo;

    @GetMapping("/buddyrest")
    public List<BuddyInfo> bd() {
        return repo.findAll();
    }
}