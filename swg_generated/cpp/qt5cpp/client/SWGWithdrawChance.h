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

/*
 * SWGWithdrawChance.h
 *
 * 
 */

#ifndef SWGWithdrawChance_H_
#define SWGWithdrawChance_H_

#include <QJsonObject>


#include "SWGAccount.h"
#include "SWGCurrency.h"
#include "SWGMemberLevel.h"
#include "SWGWithdrawLimit.h"

#include "SWGObject.h"

namespace Swagger {

class SWGWithdrawChance: public SWGObject {
public:
    SWGWithdrawChance();
    SWGWithdrawChance(QString json);
    ~SWGWithdrawChance();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    SWGWithdrawChance* fromJson(QString jsonString) override;

    SWGMemberLevel* getMemberLevel();
    void setMemberLevel(SWGMemberLevel* member_level);

    SWGCurrency* getCurrency();
    void setCurrency(SWGCurrency* currency);

    SWGAccount* getAccount();
    void setAccount(SWGAccount* account);

    SWGWithdrawLimit* getWithdrawLimit();
    void setWithdrawLimit(SWGWithdrawLimit* withdraw_limit);


    virtual bool isSet() override;

private:
    SWGMemberLevel* member_level;
    bool m_member_level_isSet;

    SWGCurrency* currency;
    bool m_currency_isSet;

    SWGAccount* account;
    bool m_account_isSet;

    SWGWithdrawLimit* withdraw_limit;
    bool m_withdraw_limit_isSet;

};

}

#endif /* SWGWithdrawChance_H_ */
