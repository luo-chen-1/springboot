package com.wjj;

import com.wjj.domain.Discuss;
import com.wjj.repository.DiscussRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author :wjj
 * @date : 2023/3/20
 * @Description :
 */
@RestController
@AllArgsConstructor
public class GetPageTest implements getPage{

    private DiscussRepository discussRepository;

    @GetMapping("/getPage")
    List<Discuss> getPage(@RequestParam(value = "page",defaultValue = pageID)Integer page,
                          @RequestParam(value = "size",defaultValue = pageSize)Integer size){
        Pageable pageable = PageRequest.of(page,size);
        List<Discuss> list = discussRepository.getDiscussesByPage(pageable);
        return list;
    }


}
