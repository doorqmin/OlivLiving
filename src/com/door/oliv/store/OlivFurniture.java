package com.door.oliv.store;

import java.time.LocalDate;

/**
 * 가구
상품 정보: 이미지 1장, 설명 텍스트, 제품 설명 문서(odt 파일), Q&A, 구매 후기(평점 등)
관련 기능: 상품 등록, 정보 수정
 * 
 *
 */
public class OlivFurniture {
	String 제품코드; // 고유번호
	String 제품설명; // 최대 500글자
	double 제품가격; // 가구 1개 당 가격, 단위=위안?
	int 제품중량; // 용량, 단위: ??
	int 제작수량; // 만들어질 수량
	int 제고수량; // 남은 가구 수량 = (포장되어있는)판매가능수량+ (불량 or 포장X)판매불가능수량
	int 판매수량; // (포장되어있는)판매가능수량
	int 판매불가능수량; //(불량 or 포장X)판매불가능수량
	int 누적판매수량; // 누적 판매 수량
	LocalDate 제조일자;
	LocalDate 등록일자;
	// 이미지(jpg, png, bmp)
	// 설명 odt 파일
}
