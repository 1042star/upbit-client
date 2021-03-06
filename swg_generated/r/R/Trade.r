# Upbit Open API
#
# ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
#
# OpenAPI spec version: 1.0.0
# Contact: ujhin942@gmail.com
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Trade Class
#'
#' @field market 
#' @field uuid 
#' @field price 
#' @field volume 
#' @field funds 
#' @field side 
#' @field created_at 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Trade <- R6::R6Class(
  'Trade',
  public = list(
    `market` = NULL,
    `uuid` = NULL,
    `price` = NULL,
    `volume` = NULL,
    `funds` = NULL,
    `side` = NULL,
    `created_at` = NULL,
    initialize = function(`market`, `uuid`, `price`, `volume`, `funds`, `side`, `created_at`){
      if (!missing(`market`)) {
        stopifnot(is.character(`market`), length(`market`) == 1)
        self$`market` <- `market`
      }
      if (!missing(`uuid`)) {
        stopifnot(is.character(`uuid`), length(`uuid`) == 1)
        self$`uuid` <- `uuid`
      }
      if (!missing(`price`)) {
        stopifnot(is.character(`price`), length(`price`) == 1)
        self$`price` <- `price`
      }
      if (!missing(`volume`)) {
        stopifnot(is.character(`volume`), length(`volume`) == 1)
        self$`volume` <- `volume`
      }
      if (!missing(`funds`)) {
        stopifnot(is.character(`funds`), length(`funds`) == 1)
        self$`funds` <- `funds`
      }
      if (!missing(`side`)) {
        stopifnot(is.character(`side`), length(`side`) == 1)
        self$`side` <- `side`
      }
      if (!missing(`created_at`)) {
        stopifnot(is.character(`created_at`), length(`created_at`) == 1)
        self$`created_at` <- `created_at`
      }
    },
    toJSON = function() {
      TradeObject <- list()
      if (!is.null(self$`market`)) {
        TradeObject[['market']] <- self$`market`
      }
      if (!is.null(self$`uuid`)) {
        TradeObject[['uuid']] <- self$`uuid`
      }
      if (!is.null(self$`price`)) {
        TradeObject[['price']] <- self$`price`
      }
      if (!is.null(self$`volume`)) {
        TradeObject[['volume']] <- self$`volume`
      }
      if (!is.null(self$`funds`)) {
        TradeObject[['funds']] <- self$`funds`
      }
      if (!is.null(self$`side`)) {
        TradeObject[['side']] <- self$`side`
      }
      if (!is.null(self$`created_at`)) {
        TradeObject[['created_at']] <- self$`created_at`
      }

      TradeObject
    },
    fromJSON = function(TradeJson) {
      TradeObject <- jsonlite::fromJSON(TradeJson)
      if (!is.null(TradeObject$`market`)) {
        self$`market` <- TradeObject$`market`
      }
      if (!is.null(TradeObject$`uuid`)) {
        self$`uuid` <- TradeObject$`uuid`
      }
      if (!is.null(TradeObject$`price`)) {
        self$`price` <- TradeObject$`price`
      }
      if (!is.null(TradeObject$`volume`)) {
        self$`volume` <- TradeObject$`volume`
      }
      if (!is.null(TradeObject$`funds`)) {
        self$`funds` <- TradeObject$`funds`
      }
      if (!is.null(TradeObject$`side`)) {
        self$`side` <- TradeObject$`side`
      }
      if (!is.null(TradeObject$`created_at`)) {
        self$`created_at` <- TradeObject$`created_at`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "market": %s,
           "uuid": %s,
           "price": %s,
           "volume": %s,
           "funds": %s,
           "side": %s,
           "created_at": %s
        }',
        self$`market`,
        self$`uuid`,
        self$`price`,
        self$`volume`,
        self$`funds`,
        self$`side`,
        self$`created_at`
      )
    },
    fromJSONString = function(TradeJson) {
      TradeObject <- jsonlite::fromJSON(TradeJson)
      self$`market` <- TradeObject$`market`
      self$`uuid` <- TradeObject$`uuid`
      self$`price` <- TradeObject$`price`
      self$`volume` <- TradeObject$`volume`
      self$`funds` <- TradeObject$`funds`
      self$`side` <- TradeObject$`side`
      self$`created_at` <- TradeObject$`created_at`
    }
  )
)
