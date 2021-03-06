/**
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

#ifndef ModelFactory_H_
#define ModelFactory_H_

#include "SWGObject.h"

#include "SWGAPIKey.h"
#include "SWGAccount.h"
#include "SWGAsk.h"
#include "SWGAskAccount.h"
#include "SWGBid.h"
#include "SWGBidAccount.h"
#include "SWGCandleDate.h"
#include "SWGCandleDays.h"
#include "SWGCandleMinutes.h"
#include "SWGCurrency.h"
#include "SWGDeposit.h"
#include "SWGDepositCompleteResponse.h"
#include "SWGDepositTransferResponse.h"
#include "SWGError.h"
#include "SWGErrorInfo.h"
#include "SWGMarket.h"
#include "SWGMarketInfo.h"
#include "SWGMemberLevel.h"
#include "SWGNewOrder.h"
#include "SWGOrder.h"
#include "SWGOrderChance.h"
#include "SWGOrderInfo.h"
#include "SWGOrderbook.h"
#include "SWGOrderbookUnit.h"
#include "SWGTicker.h"
#include "SWGTrade.h"
#include "SWGTradeTicks.h"
#include "SWGWallet.h"
#include "SWGWithdraw.h"
#include "SWGWithdrawChance.h"
#include "SWGWithdrawCoin.h"
#include "SWGWithdrawLimit.h"

namespace Swagger {

  inline void* create(QString type) {
    if(QString("SWGAPIKey").compare(type) == 0) {
      return new SWGAPIKey();
    }
    if(QString("SWGAccount").compare(type) == 0) {
      return new SWGAccount();
    }
    if(QString("SWGAsk").compare(type) == 0) {
      return new SWGAsk();
    }
    if(QString("SWGAskAccount").compare(type) == 0) {
      return new SWGAskAccount();
    }
    if(QString("SWGBid").compare(type) == 0) {
      return new SWGBid();
    }
    if(QString("SWGBidAccount").compare(type) == 0) {
      return new SWGBidAccount();
    }
    if(QString("SWGCandleDate").compare(type) == 0) {
      return new SWGCandleDate();
    }
    if(QString("SWGCandleDays").compare(type) == 0) {
      return new SWGCandleDays();
    }
    if(QString("SWGCandleMinutes").compare(type) == 0) {
      return new SWGCandleMinutes();
    }
    if(QString("SWGCurrency").compare(type) == 0) {
      return new SWGCurrency();
    }
    if(QString("SWGDeposit").compare(type) == 0) {
      return new SWGDeposit();
    }
    if(QString("SWGDepositCompleteResponse").compare(type) == 0) {
      return new SWGDepositCompleteResponse();
    }
    if(QString("SWGDepositTransferResponse").compare(type) == 0) {
      return new SWGDepositTransferResponse();
    }
    if(QString("SWGError").compare(type) == 0) {
      return new SWGError();
    }
    if(QString("SWGErrorInfo").compare(type) == 0) {
      return new SWGErrorInfo();
    }
    if(QString("SWGMarket").compare(type) == 0) {
      return new SWGMarket();
    }
    if(QString("SWGMarketInfo").compare(type) == 0) {
      return new SWGMarketInfo();
    }
    if(QString("SWGMemberLevel").compare(type) == 0) {
      return new SWGMemberLevel();
    }
    if(QString("SWGNewOrder").compare(type) == 0) {
      return new SWGNewOrder();
    }
    if(QString("SWGOrder").compare(type) == 0) {
      return new SWGOrder();
    }
    if(QString("SWGOrderChance").compare(type) == 0) {
      return new SWGOrderChance();
    }
    if(QString("SWGOrderInfo").compare(type) == 0) {
      return new SWGOrderInfo();
    }
    if(QString("SWGOrderbook").compare(type) == 0) {
      return new SWGOrderbook();
    }
    if(QString("SWGOrderbookUnit").compare(type) == 0) {
      return new SWGOrderbookUnit();
    }
    if(QString("SWGTicker").compare(type) == 0) {
      return new SWGTicker();
    }
    if(QString("SWGTrade").compare(type) == 0) {
      return new SWGTrade();
    }
    if(QString("SWGTradeTicks").compare(type) == 0) {
      return new SWGTradeTicks();
    }
    if(QString("SWGWallet").compare(type) == 0) {
      return new SWGWallet();
    }
    if(QString("SWGWithdraw").compare(type) == 0) {
      return new SWGWithdraw();
    }
    if(QString("SWGWithdrawChance").compare(type) == 0) {
      return new SWGWithdrawChance();
    }
    if(QString("SWGWithdrawCoin").compare(type) == 0) {
      return new SWGWithdrawCoin();
    }
    if(QString("SWGWithdrawLimit").compare(type) == 0) {
      return new SWGWithdrawLimit();
    }
    
    return nullptr;
  }

  inline void* create(QString json, QString type) {
    if(type.startsWith("QString")) {
      return new QString();
    }    
    auto val = static_cast<SWGObject*>(create(type));
    if(val != nullptr) {
      return val->fromJson(json);
    }
    return nullptr;
  }

}

#endif /* ModelFactory_H_ */
