package com.codestates.section2week4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan
// 컴포넌트 스캔을 사용하면 @Configuration이 붙은 설정 정보도 자동으로 등록, DependencyConfig 등 @Configuration 설정이 된 파일이 있을 시 뒤 내용 추가
public class AutoDependencyConfig {
}
