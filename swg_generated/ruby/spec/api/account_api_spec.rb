=begin
#Upbit Open API

### REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 

OpenAPI spec version: 1.0.0
Contact: ujhin942@gmail.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.18

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::AccountApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AccountApi' do
  before do
    # run before each test
    @instance = SwaggerClient::AccountApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AccountApi' do
    it 'should create an instance of AccountApi' do
      expect(@instance).to be_instance_of(SwaggerClient::AccountApi)
    end
  end

  # unit tests for account_info
  # 전체 계좌 조회
  # ## 내가 보유한 자산 리스트를 보여줍니다. 
  # @param [Hash] opts the optional parameters
  # @return [Array<Account>]
  describe 'account_info test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for account_wallet
  # 입출금 현황
  # ## 입출금 현황 및 블록 상태를 조회합니다.  **NOTE**: 입출금 현황 데이터는 실제 서비스 상태와 다를 수 있습니다.  입출금 현황 API에서 제공하는 입출금 상태, 블록 상태 정보는 수 분 정도 지연되어 반영될 수 있습니다. 본 API는 참고용으로만 사용하시길 바라며 실제 입출금을 수행하기 전에는 반드시 업비트 공지사항 및 입출금 현황 페이지를 참고해주시기 바랍니다. 
  # @param [Hash] opts the optional parameters
  # @return [Array<Wallet>]
  describe 'account_wallet test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
