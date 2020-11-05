package club.codedemo.springautowire.section4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarService {
    @Autowired(required = false)
    BarRepository barRepository;
}
