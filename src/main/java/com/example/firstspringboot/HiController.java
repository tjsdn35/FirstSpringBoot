package com.example.firstspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// 요청 URI 관리 요청 -> 컨트롤러 -> 결과 반환 -> 웹브라우저로 전송
@RestController
public class HiController {
    // 요청 URL(요청 파일)을 관리 함수 등록
    // 요청방식 명시 get || post
    // 요청자원이 있는 위치 또는 파일 : PATH부름
    // 대소문자 구별 주소는 웹루트를 의미하는 "/" + 서브폴더 + 파일
    @GetMapping("/hi")
    
    public String hello() {
        // 1. 데이터만 응답 = REST API 서비스라고 부름
        //  @RestController 클래스 필요 - 이미 스프링부트완비
        // 2. 동적 홈페이지가 필요 리소스 templat폴더 사용
        // 3. @Controller +  @ResponseBody = @RestController
        String message = " 반가워 ^^; 친구야!~~ ";
        return message;
    }
    
    
   
}
