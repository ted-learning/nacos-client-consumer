package demo.nacos.client.consumer.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@RequestMapping("/")
@RestController
class TalkController {
    @Autowired
    lateinit var restWithLoadBalanced: RestTemplate

    @GetMapping("/talk")
    fun talk(): Map<String, String> {
        return restWithLoadBalanced.getForObject("/hello")
    }
}