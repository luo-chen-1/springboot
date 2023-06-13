package com.wjj.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @Min(value = 4,message = "文章 id 最小不能小于4")
    private int id;
    @NotEmpty(message = "文章内容不能为空")
    private String title;
    @Length(min = 2,max = 9,message = "姓名长度必须在 [2,10] 之间")
    private String author;
    @Email
    private String email;
    @Future
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GTM+8")
    private LocalDateTime createTime;
}
