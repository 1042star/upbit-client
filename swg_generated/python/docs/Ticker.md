# Ticker

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market** | **str** | 종목 구분 코드 | [optional] 
**trade_date** | **str** | 최근 거래 일자(UTC) | [optional] 
**trade_time** | **str** | 최근 거래 시각(UTC) | [optional] 
**trade_date_kst** | **str** | 최근 거래 일자(KST) | [optional] 
**trade_time_kst** | **str** | 최근 거래 시각(KST) | [optional] 
**opening_price** | **float** | 시가 | [optional] 
**high_price** | **float** | 고가 | [optional] 
**low_price** | **float** | 저가 | [optional] 
**trade_price** | **float** | 종가 | [optional] 
**prev_closing_price** | **float** | 전일 종가 | [optional] 
**change** | **str** | EVEN : 보합 RISE : 상승 FALL : 하락  | [optional] 
**change_price** | **float** | 변화액의 절대값 | [optional] 
**change_rate** | **float** | 변화율의 절대값 | [optional] 
**signed_change_price** | **float** | 부호가 있는 변화액 | [optional] 
**signed_change_rate** | **float** | 부호가 있는 변화율 | [optional] 
**trade_volume** | **float** | 가장 최근 거래량 | [optional] 
**acc_trade_price** | **float** | 누적 거래대금 (UTC 0시 기준) | [optional] 
**acc_trade_price_24h** | **float** | 24시간 누적 거래대금 | [optional] 
**acc_trade_volume** | **float** | 누적 거래량 (UTC 0시 기준) | [optional] 
**acc_trade_volume_24h** | **float** | 24시간 누적 거래량 | [optional] 
**highest_52_week_price** | **float** | 52주 신고가 | [optional] 
**highest_52_week_date** | **str** | 52주 신고가 달성일 | [optional] 
**lowest_52_week_price** | **float** | 52주 신저가 | [optional] 
**lowest_52_week_date** | **str** | 52주 신저가 달성일 | [optional] 
**timestamp** | **float** | 타임스탬프 | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


