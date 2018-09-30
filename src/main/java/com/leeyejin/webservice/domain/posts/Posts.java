package com.leeyejin.webservice.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// 기본 생성자 자동 추가, 접근권한 protected
// Entity 클래스를 프로젝트 코드상에서 기본 생성자로 생성하는 것은 막되, JPA에서 Entity 클래스를 생성하는 것은 허용
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Posts {

    // PK 필드
    // PK 생성 규칙 : 자동증가형 함수
    @Id
    @GeneratedValue
    private Long id;

    // 테이블의 컬럼
    // 문자열의 기본 타입은 VARCHAR(255), 타입을 TEXT으로 변경 가능, length로 사이즈 설정
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    // 해당 클래스의 빌더 패턴 클래스 생성 (생성자 상단에서 선언 시 생성자에 포함된 필드만 빌더에 포함)
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
