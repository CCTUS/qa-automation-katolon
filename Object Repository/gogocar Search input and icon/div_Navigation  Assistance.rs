<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Navigation  Assistance</name>
   <tag></tag>
   <elementGuidId>ff73c7f6-643c-4d60-91a1-a7f36ec7696e</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='From USA'])[1]/following::div[2]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>col-xs-11 col-md-8 col-sm-8 pull-right header_right</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>      Navigation  Assistance         &lt;div class=&quot;uib-dropdown-menu dropdownMenuCustom&quot; role=&quot;menu&quot;>
              &lt;div class=&quot;config_top_drop_dv&quot;>
                &lt;div>Coming Soon!&lt;/div>
              &lt;/div>
            &lt;/div>   SIGN IN / SIGN UP             &lt;div class=&quot;uib-dropdown-menu dropdownMenuCustom&quot; role=&quot;menu&quot; aria-labelledby=&quot;button-template-urllog&quot; ng-click=&quot;$event.stopPropagation()&quot;>
              &lt;div class=&quot;ggc-dialog card-level-3&quot;>
                &lt;p>&lt;b>NOTIFICATIONS&lt;/b>&lt;/p>
                &lt;div class=&quot;notification_scroll&quot; ng-scrollbar rebuild-on-resize rebuild-on=&quot;rebuild:me&quot; style=&quot;height:100%;&quot; >
                  &lt;div class=&quot;ntfcn_bx&quot; ng-init=&quot;$root.scrllbarDirectUpdate()&quot;  ng-if=&quot;newmsgCount > 0&quot; ng-repeat=&quot;item in notificationMessage | orderBy: '-timetoken' track by $index &quot; ng-click=&quot;announceClick(item.message.type,item,item.message.subtype)&quot;>
                    &lt;h2>{{item.message.type ? item.message.type==&quot;auction_upload&quot; ? &quot;Auction&quot; : item.message.type:&quot;Other&quot;}}&lt;/h2>
                    &lt;p>&lt;b>{{item.message.fromName}} &amp;nbsp; : &amp;nbsp;&lt;/b>{{item.message.topic}}&lt;/p>
                    &lt;i class=&quot;fa fa-clock-o&quot; style=&quot;color: #482d62!important;&quot;>&lt;span>{{formatDuration(item.timetoken)}}&lt;/span>&lt;/i>
                  &lt;/div>
                  &lt;div ng-if=&quot;newmsgCount &lt;= 0&quot;>
                    &lt;p>No new / unread Notifications!&lt;/p>
                  &lt;/div>
                &lt;/div>
              &lt;/div>
            &lt;/div>   &lt;div class=&quot;uib-dropdown-menu dropdownMenuCustom&quot; role=&quot;menu&quot; ng-init=&quot;profilepercentagecalculation()&quot; aria-labelledby=&quot;button-template-urllog&quot;
              style=&quot;min-width: 0px!important;&quot; ng-click=&quot;$event.stopPropagation()&quot;>
              &lt;div class=&quot;config_top_drop_dv&quot;>
                &lt;div class=&quot;top_dropdown_name&quot;>
                  Hi {{userInfo.UserFirstName}}&lt;br>
                  &lt;span ng-if=&quot;userInfo.UserCity || userInfo.UserState&quot;>{{userInfo.UserCity}}, {{userInfo.UserState}}&lt;/span>
                &lt;/div>
                &lt;div class=&quot;profile_completion_bar&quot; style=&quot;width:calc(100% - 40px);&quot;>
                  &lt;div class=&quot;orange_bar_inner&quot; ng-style=&quot;{'width':profile_percent+'%'};&quot;>&lt;/div>
                &lt;/div>
                &lt;div class=&quot;clearfix&quot;>&lt;/div>
                &lt;div class=&quot;completion_percentage clearfix&quot;>{{profile_percent}}% Profile Completed&lt;/div>
                &lt;div class=&quot;config_drop_top_txt top_dropdown_dv&quot; ng-if=&quot;role=='dealer'&quot; ui-sref=&quot;root.dashboard.dealerProfile&quot;>About Me
                  &lt;li class=&quot;fa fa-user&quot; style=&quot;float: right;&quot;>&lt;/li>
                &lt;/div>
                &lt;div class=&quot;config_drop_top_txt top_dropdown_dv&quot; ng-if=&quot;role=='employee'&quot; ui-sref=&quot;root.dashboard.employeeProfile&quot;>About Me
                  &lt;li class=&quot;fa fa-user&quot; style=&quot;float: right;&quot;>&lt;/li>
                &lt;/div>
                &lt;div class=&quot;config_drop_top_txt top_dropdown_dv&quot; ng-if=&quot;role=='customer'&quot; ui-sref=&quot;root.dashboard.userProfile&quot;>About Me
                  &lt;li class=&quot;fa fa-user&quot; style=&quot;float: right;&quot;>&lt;/li>
                &lt;/div>
                &lt;div class=&quot;config_drop_top_txt top_dropdown_dv&quot; ng-show=&quot;isLogged&quot; ng-click=&quot;dashboard()&quot;>Dashboard
                  &lt;li class=&quot;fa fa-tasks&quot; style=&quot;float: right;&quot;>&lt;/li>
                &lt;/div>
                &lt;dashboard-car-search>&lt;/dashboard-car-search>
                &lt;div class=&quot;config_drop_top_txt top_dropdown_dv&quot; ng-show=&quot;isLoggedIn&quot; ng-click=&quot;logout()&quot;>Logout
                  &lt;li class=&quot;fa fa-power-off&quot; style=&quot;float: right;&quot;>&lt;/li>
                &lt;/div>
              &lt;/div>
            &lt;/div>      </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;consumer&quot;]/div[@class=&quot;dv_container config_bg&quot;]/div[3]/div[2]/div[@class=&quot;ggc-navig-wrap header-theme1&quot;]/div[@class=&quot;row brn-row-one brn-row-one1&quot;]/div[@class=&quot;container-fluid&quot;]/div[@class=&quot;col-xs-11 col-md-8 col-sm-8 pull-right header_right&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='From USA'])[1]/following::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <value>//div[6]/div/div/div[3]</value>
   </webElementXpaths>
</WebElementEntity>
