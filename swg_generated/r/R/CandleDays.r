# Upbit Open API
#
# ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
#
# OpenAPI spec version: 1.0.0
# Contact: ujhin942@gmail.com
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' CandleDays Class
#'
#' @field market 
#' @field candle_date_time_utc 
#' @field candle_date_time_kst 
#' @field opening_price 
#' @field high_price 
#' @field low_price 
#' @field trade_price 
#' @field timestamp 
#' @field candle_acc_trade_price 
#' @field candle_acc_trade_volume 
#' @field prev_closing_price 
#' @field change_price 
#' @field change_rate 
#' @field converted_trade_price 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CandleDays <- R6::R6Class(
  'CandleDays',
  public = list(
    `market` = NULL,
    `candle_date_time_utc` = NULL,
    `candle_date_time_kst` = NULL,
    `opening_price` = NULL,
    `high_price` = NULL,
    `low_price` = NULL,
    `trade_price` = NULL,
    `timestamp` = NULL,
    `candle_acc_trade_price` = NULL,
    `candle_acc_trade_volume` = NULL,
    `prev_closing_price` = NULL,
    `change_price` = NULL,
    `change_rate` = NULL,
    `converted_trade_price` = NULL,
    initialize = function(`market`, `candle_date_time_utc`, `candle_date_time_kst`, `opening_price`, `high_price`, `low_price`, `trade_price`, `timestamp`, `candle_acc_trade_price`, `candle_acc_trade_volume`, `prev_closing_price`, `change_price`, `change_rate`, `converted_trade_price`){
      if (!missing(`market`)) {
        stopifnot(is.character(`market`), length(`market`) == 1)
        self$`market` <- `market`
      }
      if (!missing(`candle_date_time_utc`)) {
        stopifnot(is.character(`candle_date_time_utc`), length(`candle_date_time_utc`) == 1)
        self$`candle_date_time_utc` <- `candle_date_time_utc`
      }
      if (!missing(`candle_date_time_kst`)) {
        stopifnot(is.character(`candle_date_time_kst`), length(`candle_date_time_kst`) == 1)
        self$`candle_date_time_kst` <- `candle_date_time_kst`
      }
      if (!missing(`opening_price`)) {
        stopifnot(is.numeric(`opening_price`), length(`opening_price`) == 1)
        self$`opening_price` <- `opening_price`
      }
      if (!missing(`high_price`)) {
        stopifnot(is.numeric(`high_price`), length(`high_price`) == 1)
        self$`high_price` <- `high_price`
      }
      if (!missing(`low_price`)) {
        stopifnot(is.numeric(`low_price`), length(`low_price`) == 1)
        self$`low_price` <- `low_price`
      }
      if (!missing(`trade_price`)) {
        stopifnot(is.numeric(`trade_price`), length(`trade_price`) == 1)
        self$`trade_price` <- `trade_price`
      }
      if (!missing(`timestamp`)) {
        self$`timestamp` <- `timestamp`
      }
      if (!missing(`candle_acc_trade_price`)) {
        stopifnot(is.numeric(`candle_acc_trade_price`), length(`candle_acc_trade_price`) == 1)
        self$`candle_acc_trade_price` <- `candle_acc_trade_price`
      }
      if (!missing(`candle_acc_trade_volume`)) {
        stopifnot(is.numeric(`candle_acc_trade_volume`), length(`candle_acc_trade_volume`) == 1)
        self$`candle_acc_trade_volume` <- `candle_acc_trade_volume`
      }
      if (!missing(`prev_closing_price`)) {
        stopifnot(is.numeric(`prev_closing_price`), length(`prev_closing_price`) == 1)
        self$`prev_closing_price` <- `prev_closing_price`
      }
      if (!missing(`change_price`)) {
        stopifnot(is.numeric(`change_price`), length(`change_price`) == 1)
        self$`change_price` <- `change_price`
      }
      if (!missing(`change_rate`)) {
        stopifnot(is.numeric(`change_rate`), length(`change_rate`) == 1)
        self$`change_rate` <- `change_rate`
      }
      if (!missing(`converted_trade_price`)) {
        stopifnot(is.numeric(`converted_trade_price`), length(`converted_trade_price`) == 1)
        self$`converted_trade_price` <- `converted_trade_price`
      }
    },
    toJSON = function() {
      CandleDaysObject <- list()
      if (!is.null(self$`market`)) {
        CandleDaysObject[['market']] <- self$`market`
      }
      if (!is.null(self$`candle_date_time_utc`)) {
        CandleDaysObject[['candle_date_time_utc']] <- self$`candle_date_time_utc`
      }
      if (!is.null(self$`candle_date_time_kst`)) {
        CandleDaysObject[['candle_date_time_kst']] <- self$`candle_date_time_kst`
      }
      if (!is.null(self$`opening_price`)) {
        CandleDaysObject[['opening_price']] <- self$`opening_price`
      }
      if (!is.null(self$`high_price`)) {
        CandleDaysObject[['high_price']] <- self$`high_price`
      }
      if (!is.null(self$`low_price`)) {
        CandleDaysObject[['low_price']] <- self$`low_price`
      }
      if (!is.null(self$`trade_price`)) {
        CandleDaysObject[['trade_price']] <- self$`trade_price`
      }
      if (!is.null(self$`timestamp`)) {
        CandleDaysObject[['timestamp']] <- self$`timestamp`
      }
      if (!is.null(self$`candle_acc_trade_price`)) {
        CandleDaysObject[['candle_acc_trade_price']] <- self$`candle_acc_trade_price`
      }
      if (!is.null(self$`candle_acc_trade_volume`)) {
        CandleDaysObject[['candle_acc_trade_volume']] <- self$`candle_acc_trade_volume`
      }
      if (!is.null(self$`prev_closing_price`)) {
        CandleDaysObject[['prev_closing_price']] <- self$`prev_closing_price`
      }
      if (!is.null(self$`change_price`)) {
        CandleDaysObject[['change_price']] <- self$`change_price`
      }
      if (!is.null(self$`change_rate`)) {
        CandleDaysObject[['change_rate']] <- self$`change_rate`
      }
      if (!is.null(self$`converted_trade_price`)) {
        CandleDaysObject[['converted_trade_price']] <- self$`converted_trade_price`
      }

      CandleDaysObject
    },
    fromJSON = function(CandleDaysJson) {
      CandleDaysObject <- jsonlite::fromJSON(CandleDaysJson)
      if (!is.null(CandleDaysObject$`market`)) {
        self$`market` <- CandleDaysObject$`market`
      }
      if (!is.null(CandleDaysObject$`candle_date_time_utc`)) {
        self$`candle_date_time_utc` <- CandleDaysObject$`candle_date_time_utc`
      }
      if (!is.null(CandleDaysObject$`candle_date_time_kst`)) {
        self$`candle_date_time_kst` <- CandleDaysObject$`candle_date_time_kst`
      }
      if (!is.null(CandleDaysObject$`opening_price`)) {
        self$`opening_price` <- CandleDaysObject$`opening_price`
      }
      if (!is.null(CandleDaysObject$`high_price`)) {
        self$`high_price` <- CandleDaysObject$`high_price`
      }
      if (!is.null(CandleDaysObject$`low_price`)) {
        self$`low_price` <- CandleDaysObject$`low_price`
      }
      if (!is.null(CandleDaysObject$`trade_price`)) {
        self$`trade_price` <- CandleDaysObject$`trade_price`
      }
      if (!is.null(CandleDaysObject$`timestamp`)) {
        self$`timestamp` <- CandleDaysObject$`timestamp`
      }
      if (!is.null(CandleDaysObject$`candle_acc_trade_price`)) {
        self$`candle_acc_trade_price` <- CandleDaysObject$`candle_acc_trade_price`
      }
      if (!is.null(CandleDaysObject$`candle_acc_trade_volume`)) {
        self$`candle_acc_trade_volume` <- CandleDaysObject$`candle_acc_trade_volume`
      }
      if (!is.null(CandleDaysObject$`prev_closing_price`)) {
        self$`prev_closing_price` <- CandleDaysObject$`prev_closing_price`
      }
      if (!is.null(CandleDaysObject$`change_price`)) {
        self$`change_price` <- CandleDaysObject$`change_price`
      }
      if (!is.null(CandleDaysObject$`change_rate`)) {
        self$`change_rate` <- CandleDaysObject$`change_rate`
      }
      if (!is.null(CandleDaysObject$`converted_trade_price`)) {
        self$`converted_trade_price` <- CandleDaysObject$`converted_trade_price`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "market": %s,
           "candle_date_time_utc": %s,
           "candle_date_time_kst": %s,
           "opening_price": %d,
           "high_price": %d,
           "low_price": %d,
           "trade_price": %d,
           "timestamp": %s,
           "candle_acc_trade_price": %d,
           "candle_acc_trade_volume": %d,
           "prev_closing_price": %d,
           "change_price": %d,
           "change_rate": %d,
           "converted_trade_price": %d
        }',
        self$`market`,
        self$`candle_date_time_utc`,
        self$`candle_date_time_kst`,
        self$`opening_price`,
        self$`high_price`,
        self$`low_price`,
        self$`trade_price`,
        self$`timestamp`,
        self$`candle_acc_trade_price`,
        self$`candle_acc_trade_volume`,
        self$`prev_closing_price`,
        self$`change_price`,
        self$`change_rate`,
        self$`converted_trade_price`
      )
    },
    fromJSONString = function(CandleDaysJson) {
      CandleDaysObject <- jsonlite::fromJSON(CandleDaysJson)
      self$`market` <- CandleDaysObject$`market`
      self$`candle_date_time_utc` <- CandleDaysObject$`candle_date_time_utc`
      self$`candle_date_time_kst` <- CandleDaysObject$`candle_date_time_kst`
      self$`opening_price` <- CandleDaysObject$`opening_price`
      self$`high_price` <- CandleDaysObject$`high_price`
      self$`low_price` <- CandleDaysObject$`low_price`
      self$`trade_price` <- CandleDaysObject$`trade_price`
      self$`timestamp` <- CandleDaysObject$`timestamp`
      self$`candle_acc_trade_price` <- CandleDaysObject$`candle_acc_trade_price`
      self$`candle_acc_trade_volume` <- CandleDaysObject$`candle_acc_trade_volume`
      self$`prev_closing_price` <- CandleDaysObject$`prev_closing_price`
      self$`change_price` <- CandleDaysObject$`change_price`
      self$`change_rate` <- CandleDaysObject$`change_rate`
      self$`converted_trade_price` <- CandleDaysObject$`converted_trade_price`
    }
  )
)
