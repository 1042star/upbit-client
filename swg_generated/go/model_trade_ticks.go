/*
 * Upbit Open API
 *
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * API version: 1.0.0
 * Contact: ujhin942@gmail.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

type TradeTicks struct {
	// 마켓 구분 코드
	Market string `json:"market,omitempty"`
	// 체결 일자 (UTC 기준)
	TradeDateUtc string `json:"trade_date_utc,omitempty"`
	// 체결 시각 (UTC 기준)
	TradeTimeUtc string `json:"trade_time_utc,omitempty"`
	// 체결 타임스탬프
	Timestamp float32 `json:"timestamp,omitempty"`
	// 체결 가격
	TradePrice float64 `json:"trade_price,omitempty"`
	// 체결량
	TradeVolume float64 `json:"trade_volume,omitempty"`
	// 전일 종가
	PrevClosingPrice float64 `json:"prev_closing_price,omitempty"`
	// 변화량
	ChangePrice float64 `json:"change_price,omitempty"`
	// 매도/매수
	AskBid string `json:"ask_bid,omitempty"`
	// 체결 번호 (Unique) `sequential_id` 필드는 체결의 유일성 판단을 위한 근거로 쓰일 수 있습니다. 하지만 체결의 순서를 보장하지는 못합니다. 
	SequentialId float32 `json:"sequential_id,omitempty"`
}