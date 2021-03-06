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


#include "SWGOrder.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGOrder::SWGOrder(QString json) {
    init();
    this->fromJson(json);
}

SWGOrder::SWGOrder() {
    init();
}

SWGOrder::~SWGOrder() {
    this->cleanup();
}

void
SWGOrder::init() {
    uuid = new QString("");
    m_uuid_isSet = false;
    side = new QString("");
    m_side_isSet = false;
    ord_type = new QString("");
    m_ord_type_isSet = false;
    price = new QString("");
    m_price_isSet = false;
    state = new QString("");
    m_state_isSet = false;
    market = new QString("");
    m_market_isSet = false;
    created_at = new QString("");
    m_created_at_isSet = false;
    volume = new QString("");
    m_volume_isSet = false;
    remaining_volume = new QString("");
    m_remaining_volume_isSet = false;
    reserved_fee = new QString("");
    m_reserved_fee_isSet = false;
    remaining_fee = new QString("");
    m_remaining_fee_isSet = false;
    paid_fee = new QString("");
    m_paid_fee_isSet = false;
    locked = new QString("");
    m_locked_isSet = false;
    executed_volume = new QString("");
    m_executed_volume_isSet = false;
    trades_count = 0.0;
    m_trades_count_isSet = false;
}

void
SWGOrder::cleanup() {
    if(uuid != nullptr) { 
        delete uuid;
    }
    if(side != nullptr) { 
        delete side;
    }
    if(ord_type != nullptr) { 
        delete ord_type;
    }
    if(price != nullptr) { 
        delete price;
    }
    if(state != nullptr) { 
        delete state;
    }
    if(market != nullptr) { 
        delete market;
    }
    if(created_at != nullptr) { 
        delete created_at;
    }
    if(volume != nullptr) { 
        delete volume;
    }
    if(remaining_volume != nullptr) { 
        delete remaining_volume;
    }
    if(reserved_fee != nullptr) { 
        delete reserved_fee;
    }
    if(remaining_fee != nullptr) { 
        delete remaining_fee;
    }
    if(paid_fee != nullptr) { 
        delete paid_fee;
    }
    if(locked != nullptr) { 
        delete locked;
    }
    if(executed_volume != nullptr) { 
        delete executed_volume;
    }
    if(trades_count != nullptr) { 
        delete trades_count;
    }
}

SWGOrder*
SWGOrder::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGOrder::fromJsonObject(QJsonObject pJson) {
    ::Swagger::setValue(&uuid, pJson["uuid"], "QString", "QString");
    
    ::Swagger::setValue(&side, pJson["side"], "QString", "QString");
    
    ::Swagger::setValue(&ord_type, pJson["ord_type"], "QString", "QString");
    
    ::Swagger::setValue(&price, pJson["price"], "QString", "QString");
    
    ::Swagger::setValue(&state, pJson["state"], "QString", "QString");
    
    ::Swagger::setValue(&market, pJson["market"], "QString", "QString");
    
    ::Swagger::setValue(&created_at, pJson["created_at"], "QString", "QString");
    
    ::Swagger::setValue(&volume, pJson["volume"], "QString", "QString");
    
    ::Swagger::setValue(&remaining_volume, pJson["remaining_volume"], "QString", "QString");
    
    ::Swagger::setValue(&reserved_fee, pJson["reserved_fee"], "QString", "QString");
    
    ::Swagger::setValue(&remaining_fee, pJson["remaining_fee"], "QString", "QString");
    
    ::Swagger::setValue(&paid_fee, pJson["paid_fee"], "QString", "QString");
    
    ::Swagger::setValue(&locked, pJson["locked"], "QString", "QString");
    
    ::Swagger::setValue(&executed_volume, pJson["executed_volume"], "QString", "QString");
    
    ::Swagger::setValue(&trades_count, pJson["trades_count"], "SWGNumber", "SWGNumber");
    
}

QString
SWGOrder::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
SWGOrder::asJsonObject() {
    QJsonObject obj;
    if(uuid != nullptr && *uuid != QString("")){
        toJsonValue(QString("uuid"), uuid, obj, QString("QString"));
    }
    if(side != nullptr && *side != QString("")){
        toJsonValue(QString("side"), side, obj, QString("QString"));
    }
    if(ord_type != nullptr && *ord_type != QString("")){
        toJsonValue(QString("ord_type"), ord_type, obj, QString("QString"));
    }
    if(price != nullptr && *price != QString("")){
        toJsonValue(QString("price"), price, obj, QString("QString"));
    }
    if(state != nullptr && *state != QString("")){
        toJsonValue(QString("state"), state, obj, QString("QString"));
    }
    if(market != nullptr && *market != QString("")){
        toJsonValue(QString("market"), market, obj, QString("QString"));
    }
    if(created_at != nullptr && *created_at != QString("")){
        toJsonValue(QString("created_at"), created_at, obj, QString("QString"));
    }
    if(volume != nullptr && *volume != QString("")){
        toJsonValue(QString("volume"), volume, obj, QString("QString"));
    }
    if(remaining_volume != nullptr && *remaining_volume != QString("")){
        toJsonValue(QString("remaining_volume"), remaining_volume, obj, QString("QString"));
    }
    if(reserved_fee != nullptr && *reserved_fee != QString("")){
        toJsonValue(QString("reserved_fee"), reserved_fee, obj, QString("QString"));
    }
    if(remaining_fee != nullptr && *remaining_fee != QString("")){
        toJsonValue(QString("remaining_fee"), remaining_fee, obj, QString("QString"));
    }
    if(paid_fee != nullptr && *paid_fee != QString("")){
        toJsonValue(QString("paid_fee"), paid_fee, obj, QString("QString"));
    }
    if(locked != nullptr && *locked != QString("")){
        toJsonValue(QString("locked"), locked, obj, QString("QString"));
    }
    if(executed_volume != nullptr && *executed_volume != QString("")){
        toJsonValue(QString("executed_volume"), executed_volume, obj, QString("QString"));
    }
    if((trades_count != nullptr) && (trades_count->isSet())){
        toJsonValue(QString("trades_count"), trades_count, obj, QString("SWGNumber"));
    }

    return obj;
}

QString*
SWGOrder::getUuid() {
    return uuid;
}
void
SWGOrder::setUuid(QString* uuid) {
    this->uuid = uuid;
    this->m_uuid_isSet = true;
}

QString*
SWGOrder::getSide() {
    return side;
}
void
SWGOrder::setSide(QString* side) {
    this->side = side;
    this->m_side_isSet = true;
}

QString*
SWGOrder::getOrdType() {
    return ord_type;
}
void
SWGOrder::setOrdType(QString* ord_type) {
    this->ord_type = ord_type;
    this->m_ord_type_isSet = true;
}

QString*
SWGOrder::getPrice() {
    return price;
}
void
SWGOrder::setPrice(QString* price) {
    this->price = price;
    this->m_price_isSet = true;
}

QString*
SWGOrder::getState() {
    return state;
}
void
SWGOrder::setState(QString* state) {
    this->state = state;
    this->m_state_isSet = true;
}

QString*
SWGOrder::getMarket() {
    return market;
}
void
SWGOrder::setMarket(QString* market) {
    this->market = market;
    this->m_market_isSet = true;
}

QString*
SWGOrder::getCreatedAt() {
    return created_at;
}
void
SWGOrder::setCreatedAt(QString* created_at) {
    this->created_at = created_at;
    this->m_created_at_isSet = true;
}

QString*
SWGOrder::getVolume() {
    return volume;
}
void
SWGOrder::setVolume(QString* volume) {
    this->volume = volume;
    this->m_volume_isSet = true;
}

QString*
SWGOrder::getRemainingVolume() {
    return remaining_volume;
}
void
SWGOrder::setRemainingVolume(QString* remaining_volume) {
    this->remaining_volume = remaining_volume;
    this->m_remaining_volume_isSet = true;
}

QString*
SWGOrder::getReservedFee() {
    return reserved_fee;
}
void
SWGOrder::setReservedFee(QString* reserved_fee) {
    this->reserved_fee = reserved_fee;
    this->m_reserved_fee_isSet = true;
}

QString*
SWGOrder::getRemainingFee() {
    return remaining_fee;
}
void
SWGOrder::setRemainingFee(QString* remaining_fee) {
    this->remaining_fee = remaining_fee;
    this->m_remaining_fee_isSet = true;
}

QString*
SWGOrder::getPaidFee() {
    return paid_fee;
}
void
SWGOrder::setPaidFee(QString* paid_fee) {
    this->paid_fee = paid_fee;
    this->m_paid_fee_isSet = true;
}

QString*
SWGOrder::getLocked() {
    return locked;
}
void
SWGOrder::setLocked(QString* locked) {
    this->locked = locked;
    this->m_locked_isSet = true;
}

QString*
SWGOrder::getExecutedVolume() {
    return executed_volume;
}
void
SWGOrder::setExecutedVolume(QString* executed_volume) {
    this->executed_volume = executed_volume;
    this->m_executed_volume_isSet = true;
}

SWGNumber*
SWGOrder::getTradesCount() {
    return trades_count;
}
void
SWGOrder::setTradesCount(SWGNumber* trades_count) {
    this->trades_count = trades_count;
    this->m_trades_count_isSet = true;
}


bool
SWGOrder::isSet(){
    bool isObjectUpdated = false;
    do{
        if(uuid != nullptr && *uuid != QString("")){ isObjectUpdated = true; break;}
        if(side != nullptr && *side != QString("")){ isObjectUpdated = true; break;}
        if(ord_type != nullptr && *ord_type != QString("")){ isObjectUpdated = true; break;}
        if(price != nullptr && *price != QString("")){ isObjectUpdated = true; break;}
        if(state != nullptr && *state != QString("")){ isObjectUpdated = true; break;}
        if(market != nullptr && *market != QString("")){ isObjectUpdated = true; break;}
        if(created_at != nullptr && *created_at != QString("")){ isObjectUpdated = true; break;}
        if(volume != nullptr && *volume != QString("")){ isObjectUpdated = true; break;}
        if(remaining_volume != nullptr && *remaining_volume != QString("")){ isObjectUpdated = true; break;}
        if(reserved_fee != nullptr && *reserved_fee != QString("")){ isObjectUpdated = true; break;}
        if(remaining_fee != nullptr && *remaining_fee != QString("")){ isObjectUpdated = true; break;}
        if(paid_fee != nullptr && *paid_fee != QString("")){ isObjectUpdated = true; break;}
        if(locked != nullptr && *locked != QString("")){ isObjectUpdated = true; break;}
        if(executed_volume != nullptr && *executed_volume != QString("")){ isObjectUpdated = true; break;}
        if(trades_count != nullptr && trades_count->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

