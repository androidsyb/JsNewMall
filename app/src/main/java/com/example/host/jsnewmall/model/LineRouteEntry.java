package com.example.host.jsnewmall.model;

import java.util.List;

/**
 * Created by host on 2017/3/6.
 */

public class LineRouteEntry {

    /**
     * res : 1
     * msg : \u67e5\u8be2\u6210\u529f
     * data_base : {"id":"13510","guid":"ddc19cce-b357-4b1e-b751-3f3510670e11","lines_name":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","lines_title":"\\u81ea\\u7ec4\\u56e2\\uff0c\\u8d60\\u9001\\u63a5\\u9001\\uff0c\\u4e0d\\u542b\\u7b7e\\u8bc1","lines_num":"CL201701241015","lines_supname":null,"lines_filetext":null,"respon_id":"10274","respon_unitmaxid":"1313","supplier_id":"1","supplier_name":"\\u5e38\\u5dde\\u6625\\u79cb\\u56fd\\u9645\\u65c5\\u884c\\u793e\\u6709\\u9650\\u516c\\u53f8","lines_days":"6","lines_daysnight":"5","parent_lineid":"80ba1902-afd3-495e-83ea-b6f5312cd067","companyid":"1","company_name":"\\u5e38\\u5dde\\u6625\\u79cb\\u56fd\\u9645\\u65c5\\u884c\\u793e\\u6709\\u9650\\u516c\\u53f8","lines_validitybegin":null,"lines_validityend":null,"lines_modetype":"1","lines_from":"2","original_price":"0.00","scenic_spots_alongtheway":null,"isshow":"10","islogicdelete":"1","createuserid":"10274","createtime":"2017-01-24 15:57:00","travelmode":"0","ranges":"3","treepath":"1334","voucherstate":"0","lines_leaveaddress":"115","timestamp":"2017-02-15 08:50:22","iscustomized":"0","is_sync_scenic":"1","saleprice":"0.01","lines_leavecityid":"115","lines_leavecityname":"\\u5e38\\u5dde","lines_backcityid":"6058","lines_backcityname":null,"can_sale_115":1,"can_sale_113":1,"can_sale":1}
     * data_contract : {"id":"6720","linesid":"13510","guid":"ddc19cce-b357-4b1e-b751-3f3510670e11","linesguid":"ddc19cce-b357-4b1e-b751-3f3510670e11","areascodesnames":"\\u51fa\\u53d1\\u5730:\\u5e38\\u5dde\\u5e02\\n\\u76ee\\u7684\\u5730:\\u6cf0\\u56fd","linesname":"\\u3010\\u6e05\\u65b0\\u6cf0\\u56fd\\u3011\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38 \\uff08\\u5e38\\u5dde\\u5f80\\u8fd4\\uff0c\\u81ea\\u7ec4\\u56e2\\uff09","journeysight":"\\u5927\\u7687\\u5bab\\uff0c\\u7389\\u4f5b\\u5bfa\\uff0c\\u6e44\\u5357\\u6cb3\\u6c34\\u4e0a\\u5e02\\u573a\\uff0c\\u963f\\u5357\\u8fbe,\\u9a91\\u5927\\u8c61\\uff0c\\u9cc4\\u9c7c\\u8868\\u6f14\\uff0c\\u4e03\\u73cd\\u4f5b\\u5c71\\uff0c\\u4e5d\\u4e16\\u7687\\u5e99\\uff0c\\u8721\\u50cf\\u9986,\\u91d1\\u6c99\\u5c9b\\uff0c\\u4e1c\\u65b9\\/\\u66b9\\u7f57\\u516c\\u4e3b\\u53f7\\uff0c\\u5609\\u5e74\\u534e\\u98ce\\u6708\\u8857\\uff0c\\u6cf0\\u5f0f\\u53e4\\u6cd5\\u6307\\u538b\\u6309\\u6469,\\u795e\\u6bbf\\u5bfa\\uff0cKING POWER\\u56fd\\u9645\\u514d\\u7a0e\\u4e2d\\u5fc3,","servicegotrafficattrname":"\\u53bb\\u7a0b\\uff1a\\u98de\\u673a\\n\\u8fd4\\u7a0b\\uff1a\\u98de\\u673a","gotostand":"\\u8bf7\\u6e38\\u5ba2\\u81ea\\u884c\\u524d\\u5f80","serviceeatattrname":"5\\u65e98\\u6b63","servicelevelattrname":"\\u53cc\\u4eba\\u6807\\u51c6\\u95f4","journeyshopping":null,"journeyactivity":null,"journeysightself":null,"serviceguideattrname":"\\u5168\\u7a0b\\u5bfc\\u6e38\\u670d\\u52a1","payname":"\\u73b0\\u4ed8","paydate":"\\u672c\\u5408\\u540c\\u7b7e\\u8ba2\\u4e4b\\u65e5\\u4e00\\u6b21\\u6027\\u4ed8\\u6e05","teamtype":"\\u672c\\u793e\\u81ea\\u884c\\u7ec4\\u56e2","supplement":"\\u6b64\\u6b21\\u65c5\\u6e38\\u56e2\\u961f\\u6d89\\u53ca\\u9646\\u8fd0\\u3001\\u6c34\\u8fd0\\u5176\\u4e2d\\u7684\\u7968\\u52a1\\u548c\\u8f66\\u4f4d\\u635f\\u5931\\u95ee\\u9898\\u3002\\u4e00\\u7ecf\\u7b7e\\u5b57\\u786e\\u8ba4\\u540e\\uff0c\\u5982\\u987b\\u9000\\u56e2\\u6e38\\u5ba2\\u5219\\u5c06\\u5e94\\u5411\\u65c5\\u884c\\u793e\\u8865\\u507f\\u76f8\\u5e94\\u7684\\u635f\\u5931\\u3002\\u6b64\\u635f\\u5931\\u8d39\\u7528\\u53c2\\u8003\\u5b9e\\u9645\\u62a5\\u540d\\u56e2\\u961f\\u800c\\u5b9a\\u3002\\u51fa\\u56e2\\u524d24\\u5c0f\\u65f6\\u9000\\u56e2\\u6216\\u8fdf\\u523015\\u5206\\u949f\\uff0c\\u89c6\\u4e3a\\u81ea\\u52a8\\u653e\\u5f03\\uff0c\\u4e0d\\u9000\\u4efb\\u4f55\\u8d39\\u7528\\u3002\\r\\n1.\\u6211\\u793e\\u4fdd\\u8bc1\\u4ee5\\u4e0a\\u666f\\u70b9\\u5168\\u90e8\\u6e38\\u89c8,\\u6e38\\u89c8\\u987a\\u5e8f\\u6309\\u5f53\\u5929\\u5b9e\\u9645\\u60c5\\u51b5\\u4e3a\\u51c6.\\u5bfc\\u6e38\\u53ef\\u8c03\\u6574\\u6e38\\u89c8\\u987a\\u5e8f.\\r\\n2.\\u4ef7\\u683c\\u4ee5\\u62a5\\u540d\\u65f6\\u6536\\u8d39\\u4e3a\\u51c6\\uff0c\\u5c0f\\u5b69\\u6536\\u8d39\\u4e3a\\u4e0d\\u542b\\u666f\\u70b9\\u95e8\\u7968\\uff0c\\u82e5\\u4e8c\\u65e5\\u6e38\\u4ee5\\u4e0a\\u4e0d\\u542b\\u95e8\\u7968\\u548c\\u5e8a\\u4f4d\\u3002\\u5982\\u5728\\u6e38\\u89c8\\u666f\\u70b9\\u65f6\\u8d85\\u9ad8\\uff0c\\u9700\\u81ea\\u884c\\u8865\\u4ea4\\u8d85\\u9ad8\\u90e8\\u5206\\u95e8\\u7968\\uff1b\\u4e00\\u822c\\u666f\\u533a\\u513f\\u7ae5\\u8eab\\u9ad81.1\\u7c73\\u4ee5\\u4e0b\\u514d\\u7968\\u3002\\r\\n3.\\u8bf7\\u6e38\\u5ba2\\u51c6\\u65f6\\u5230\\u8fbe\\u96c6\\u5408\\u70b9\\u4e0a\\u8f66(\\u8fc7\\u65f6\\u4e0d\\u5019,\\u656c\\u8bf7\\u4f53\\u8c05),\\u4ee5\\u4fbf\\u6211\\u793e\\u5bfc\\u6e38\\u5de5\\u4f5c\\u987a\\u5229\\u5f00\\u5c55,\\u8c22\\u8c22\\u652f\\u6301\\u3002\\r\\n4.\\u5728\\u65c5\\u9014\\u4e2d\\u5982\\u9047\\u81ea\\u7406\\u666f\\u70b9,\\u6e38\\u5ba2\\u53ef\\u81ea\\u613f\\u53c2\\u52a0(\\u5168\\u8f66\\u6e38\\u5ba2\\u6309\\u5c11\\u6570\\u670d\\u4ece\\u591a\\u6570\\u539f\\u5219),\\u672a\\u53c2\\u52a0\\u8005\\u8bf7\\u5728\\u666f\\u70b9\\u95e8\\u53e3\\u7b49\\u5019,\\u8c22\\u8c22\\u914d\\u5408!\\r\\n5. \\u6211\\u793e\\u5c06\\u4f1a\\u6309\\u7167\\u6b64\\u56e2\\u62a5\\u540d\\u5148\\u540e\\u987a\\u5e8f\\u7531\\u603b\\u90e8\\u7edf\\u4e00\\u5b89\\u6392\\u5ea7\\u4f4d(\\u5982\\u8f66\\u4e0a\\u6709\\u8001\\u5f31\\u5b7a\\u9700\\u8981\\u7167\\u987e,\\u8bf7\\u5404\\u4f4d\\u56e2\\u53cb\\u81ea\\u89c9\\u793c\\u8ba9,\\u542c\\u4ece\\u5bfc\\u6e38\\u5b89\\u6392,\\u8c22\\u8c22)\\u3002\\r\\n6.\\u6e38\\u5ba2\\u81ea\\u613f\\u653e\\u5f03\\u666f\\u70b9\\u6e38\\u89c8\\u7684,\\u95e8\\u7968\\u8d39\\u7528\\u4e00\\u6982\\u4e0d\\u9000.\\r\\n7.\\u5982\\u9047\\u56fd\\u5bb6\\u6027\\u653f\\u7b56\\u8c03\\u4ef7\\u548c\\u4eba\\u529b\\u4e0d\\u53ef\\u6297\\u62d2\\u56e0\\u7d20\\u9020\\u6210\\u7684\\u635f\\u5931\\u548c\\u8d39\\u7528\\u589e\\u52a0\\u7b49\\u6e38\\u5ba2\\u81ea\\u7406\\u3002\\r\\n8.\\u5982\\u53c2\\u52a0\\u5177\\u6709\\u5371\\u9669\\u6027\\u6d3b\\u52a8\\u9879\\u76ee\\u7684\\u9700\\u5f81\\u5f97\\u6211\\u793e\\u7684\\u540c\\u610f,\\u5982\\u81ea\\u884c\\u53c2\\u52a0\\u4ea7\\u751f\\u635f\\u5931,\\u6211\\u793e\\u6982\\u4e0d\\u8d1f\\u8d23\\u3002\\r\\n9.\\u6e38\\u5ba2\\u5e94\\u5982\\u5b9e\\u8bf4\\u660e\\u8eab\\u4f53\\u72b6\\u51b5\\uff0c\\u4e0d\\u5f97\\u9690\\u7792\\u81ea\\u8eab\\u75be\\u75c5\\u3002\\u82e5\\u9690\\u7792\\u75c5\\u60c5\\uff0c\\u7531\\u81ea\\u8eab\\u539f\\u56e0\\u9020\\u6210\\u4f24\\u5bb3\\u7684\\uff0c\\u65c5\\u884c\\u793e\\u4e0d\\u627f\\u62c5\\u3002\\r\\n10.\\u51e1\\u53c2\\u52a0\\u6211\\u793e\\u7ec4\\u7ec7\\u65c5\\u6e38\\u7684\\u6240\\u6709\\u6e38\\u5ba2\\uff08\\u5305\\u62ec\\u672a\\u6d3e\\u201c\\u5168\\u7a0b\\u966a\\u540c\\u201d\\u7684\\u6563\\u5ba2\\u548c\\u6709\\u5168\\u966a\\u5bfc\\u6e38\\u7684\\u56e2\\u961f\\u6e38\\u5ba2\\uff09\\uff0c\\u5982\\u5728\\u65c5\\u6e38\\u8fc7\\u7a0b\\u4e2d\\u53d1\\u73b0\\u6709\\u4e0e\\u5408\\u540c\\u4e0d\\u7b26\\u4e4b\\u5904\\u6216\\u6709\\u5f02\\u8bae\\uff0c\\u5e94\\u5728\\u77e5\\u9053\\u60c5\\u51b5\\u7684\\u6700\\u65e9\\u65f6\\u95f4\\u901a\\u77e5\\u6211\\u793e\\uff0c\\u4fbf\\u4e8e\\u6211\\u793e\\u53ca\\u65f6\\u4e86\\u89e3\\u548c\\u89e3\\u51b3\\u95ee\\u9898\\uff0c\\u907f\\u514d\\u7531\\u4e8e\\u672a\\u53ca\\u65f6\\u901a\\u77e5\\uff0c\\u6211\\u793e\\u4e0d\\u77e5\\u60c5\\u800c\\u5ef6\\u8bef\\u5904\\u7406\\uff0c\\u4ee5\\u6700\\u5927\\u9650\\u5ea6\\u4fdd\\u969c\\u6e38\\u5ba2\\u7684\\u5408\\u6cd5\\u6743\\u76ca\\u3002\\u8bf7\\u5728\\u5f53\\u5730\\u5982\\u5b9e\\u586b\\u5199\\u300a\\u610f\\u89c1\\u53cd\\u9988\\u8868\\u300b\\uff0c\\u56e2\\u961f\\u8d28\\u91cf\\u6211\\u793e\\u4ee5\\u5404\\u4f4d\\u6e38\\u5ba2\\u5728\\u5f53\\u5730\\u586b\\u5199\\u7684\\u300a\\u610f\\u89c1\\u53cd\\u9988\\u8868\\u300b\\u4e3a\\u51c6\\u3002\\r\\n11.\\u65c5\\u6e38\\u8005\\u5728\\u672c\\u5408\\u540c\\u5b89\\u6392\\u7684\\u8d2d\\u7269\\u70b9\\u6240\\u8d2d\\u7269\\u54c1\\u5982\\u7cfb\\u5047\\u5192\\u4f2a\\u52a3\\u5546\\u54c1\\u65f6,\\u5fc5\\u987b\\u5728\\u56de\\u56e2\\u540e7\\u65e5\\u5185\\u5411\\u65c5\\u884c\\u793e\\u63d0\\u51fa\\uff01\\r\\n\\u6cbf\\u9014\\u63a5\\u9001\\uff1a\\u6bcf\\u4e24\\u5c0f\\u65f6\\u6eda\\u52a8\\u53d1\\u8f66\\uff0c\\u5982\\u56e0\\u822a\\u73ed\\u5ef6\\u8bef\\u6ca1\\u642d\\u4e58\\u5230\\u8f66\\u7684\\uff0c\\u81ea\\u52a8\\u5ef6\\u5230\\u4e0b\\u4e00\\u73ed\\uff0c\\u540c\\u65f6\\u9700\\u7ecf\\u8fc7\\u51e0\\u4e2a\\u57ce\\u5e02\\u7684\\u642d\\u4e58\\uff0c\\u65f6\\u95f4\\u8f83\\u957f\\uff01\\r\\n12.\\u4f4f\\u5bbf\\uff1a\\u5168\\u7a0b\\u6307\\u5b9a\\u9152\\u5e97\\uff08\\u63d0\\u793a\\uff1a\\u7531\\u4e8e\\u5730\\u533a\\u6027\\u5dee\\u5f02\\uff0c\\u9152\\u5e97\\u7684\\u8bc4\\u5224\\u6807\\u51c6\\u4e5f\\u5b58\\u5728\\u5dee\\u5f02\\uff0c\\u5ba2\\u4eba\\u4e0d\\u80fd\\u4ee5\\u51fa\\u53d1\\u5730\\u9152\\u5e97\\u7684\\u6807\\u51c6\\u53bb\\u8861\\u91cf\\uff0c\\u656c\\u8bf7\\u8c05\\u89e3\\uff01\\uff09\\r\\n13.\\u672c\\u56e2\\u706b\\u8f66\\u7968\\u7531\\u672c\\u65c5\\u884c\\u793e\\u4ee3\\u6536\\u4ee3\\u4ed8\\uff0c\\u706b\\u8f66\\u7968\\u7968\\u636e\\u4ea4\\u4ed8\\u5ba2\\u4eba\\u3002","remarks":"\\u672a\\u6ee116\\u4eba\\u4e0d\\u6210\\u56e2\\u65e0\\u6cd5\\u5f00\\u73ed,\\u6e38\\u5ba2\\u53ef\\u9009\\u62e9\\u987a\\u5ef6\\u65e5\\u671f\\u51fa\\u884c\\u6216\\u5168\\u989d\\u9000\\u6b3e!","notice":"\\u65c5\\u6e38\\u6d3b\\u52a8\\u672c\\u8eab\\u5e26\\u6709\\u4e00\\u5b9a\\u7684\\u5371\\u9669\\u6027\\uff0c\\u4e14\\u65c5\\u9014\\u4e2d\\u4f1a\\u6709\\u4e00\\u4e9b\\u610f\\u5916\\u4e8b\\u4ef6\\u53d1\\u751f\\uff0c\\u8bf7\\u60a8\\u52a1\\u5fc5\\u589e\\u5f3a\\u81ea\\u6211\\u4fdd\\u62a4\\u610f\\u8bc6\\u3002\\u4e3a\\u4e86\\u4fdd\\u8bc1\\u60a8\\u7684\\u672c\\u6b21\\u65c5\\u6e38\\u6d3b\\u52a8\\u987a\\u5229\\u8fdb\\u884c\\uff0c\\u8bf7\\u4ed4\\u7ec6\\u9605\\u8bfb\\u4e0b\\u5217\\u6ce8\\u610f\\u4e8b\\u9879\\u3002\\r\\n\\u203b \\u51fa\\u6e38\\u524d\\u51c6\\u5907\\r\\n1\\u3001\\u51fa\\u95e8\\u524d\\u8bf7\\u5e26\\u597d\\u6709\\u6548\\u8bc1\\u4ef6\\uff08\\u5982\\u8eab\\u4efd\\u8bc1\\u7b49\\uff09\\uff0c\\u5e76\\u544a\\u77e5\\u5bb6\\u4eba\\u51fa\\u6e38\\u8ba1\\u5212\\uff0c\\u4fdd\\u6301\\u901a\\u8baf\\u7545\\u901a\\uff0c\\u4ee5\\u4fbf\\u968f\\u65f6\\u8054\\u7cfb\\u3002\\r\\n2\\u3001\\u4e58\\u5750\\u4ea4\\u901a\\u5de5\\u5177\\uff0c\\u8bf7\\u770b\\u6e05\\u8f66\\u7ad9\\u3001\\u7801\\u5934\\u3001\\u673a\\u573a\\u540d\\u79f0\\u53ca\\u51fa\\u53d1\\u65f6\\u95f4\\uff0c\\u5e76\\u518d\\u4e00\\u6b21\\u786e\\u8ba4\\u662f\\u5426\\u5e26\\u597d\\u6709\\u6548\\u8bc1\\u4ef6\\uff0c\\u513f\\u7ae5\\u8bf7\\u5e26\\u597d\\u6237\\u53e3\\u7c3f\\u6216\\u51fa\\u751f\\u8bc1\\u539f\\u4ef6\\u3002\\u5efa\\u8bae\\u60a8\\u63d0\\u524d1\\u5c0f\\u65f6\\u5230\\u706b\\u8f66\\u7ad9\\uff08\\u7801\\u5934\\uff09\\u3001\\u63d0\\u524d120\\u5206\\u949f\\u5230\\u673a\\u573a\\uff0c\\u5e76\\u529e\\u59a5\\u5b89\\u68c0\\u7b49\\u76f8\\u5173\\u624b\\u7eed\\u3002\\r\\n3\\u3001\\u51fa\\u6e38\\u524d\\u8bf7\\u7559\\u610f\\u65c5\\u6e38\\u76ee\\u7684\\u5730\\u5929\\u6c14\\u60c5\\u51b5\\uff0c\\u9002\\u5f53\\u589e\\u51cf\\u8863\\u670d\\uff0c\\u5e76\\u5e26\\u597d\\u96e8\\u4f1e\\u3002\\u8bf7\\u9009\\u62e9\\u8f6f\\u5e95\\u8212\\u9002\\u7684\\u978b\\u5b50\\uff0c\\u767b\\u5c71\\u8bf7\\u9009\\u62e9\\u9632\\u6ed1\\u65c5\\u6e38\\u978b\\uff0c\\u5973\\u58eb\\u4e0d\\u7a7f\\u88d9\\u5b50\\u3001\\u9ad8\\u8ddf\\u978b\\u3002\\r\\n4\\u3001\\u6574\\u7406\\u597d\\u4e2a\\u4eba\\u65c5\\u6e38\\u7528\\u54c1\\u53ca\\u5e38\\u7528\\u836f\\u54c1\\uff08\\u5982\\u6655\\u8f66\\u836f\\u3001\\u6b62\\u6cfb\\u836f\\uff09\\u3001\\u6d77\\u5c9b\\u65c5\\u6e38\\u8bf7\\u5e26\\u597d\\u9632\\u6652\\u971c\\u3001\\u592a\\u9633\\u955c\\u3001\\u6cf3\\u8863\\u3001\\u62d6\\u978b\\u7b49\\u3002\\u51fa\\u95e8\\u65c5\\u6e38\\u8bf7\\u52ff\\u643a\\u5e26\\u8d35\\u91cd\\u7269\\u54c1\\u548c\\u5927\\u91cf\\u73b0\\u91d1\\u3002\\r\\n\\u203b \\u65c5\\u9014\\u5b89\\u5168\\r\\n1\\u3001\\u4e58\\u5750\\u6c7d\\u8f66\\u65c5\\u6e38\\uff0c\\u5728\\u8f66\\u8f86\\u884c\\u9a76\\u8fc7\\u7a0b\\u4e2d\\u8bf7\\u52ff\\u5728\\u8f66\\u53a2\\u5185\\u64c5\\u81ea\\u7ad9\\u7acb\\u3001\\u884c\\u8d70\\uff1b\\u513f\\u7ae5\\u5fc5\\u987b\\u6709\\u5ea7\\u4f4d\\uff1b\\u8bf7\\u7231\\u62a4\\u8f66\\u8f86\\u8bbe\\u65bd\\u8bbe\\u5907\\uff0c\\u4e0d\\u5728\\u8f66\\u53a2\\u5185\\u5438\\u70df\\uff0c\\u4fdd\\u6301\\u8f66\\u53a2\\u5185\\u73af\\u5883\\u6e05\\u6d01\\u3002\\r\\n2\\u3001\\u5728\\u6574\\u4e2a\\u65c5\\u6e38\\u8fc7\\u7a0b\\u4e2d\\u505a\\u5230\\u8d70\\u8def\\u4e0d\\u89c2\\u666f\\uff0c\\u89c2\\u666f\\u4e0d\\u8d70\\u8def\\uff0c\\u542c\\u4ece\\u5bfc\\u6e38\\u4eba\\u5458\\u7684\\u6307\\u6325\\u5b89\\u6392\\uff0c\\u4e0d\\u5f97\\u64c5\\u81ea\\u8fdb\\u5165\\u666f\\u533a\\u5185\\u7684\\u5371\\u9669\\u533a\\u57df\\u6216\\u7981\\u6b62\\u6e38\\u89c8\\u533a\\u57df\\u3002\\r\\n3\\u3001\\u8f83\\u8d35\\u91cd\\u7269\\u54c1\\uff08\\u73b0\\u91d1\\u3001\\u8bc1\\u4ef6\\u3001\\u76f8\\u673a\\u7b49\\uff09\\u8bf7\\u968f\\u8eab\\u643a\\u5e26\\uff0c\\u8bf7\\u52ff\\u9057\\u5fd8\\u5728\\u666f\\u70b9\\u3001\\u9910\\u684c\\u3001\\u8d2d\\u7269\\u5546\\u5e97\\u3001\\u5c0f\\u644a\\u4e0a\\u3002\\r\\n4\\u3001\\u6e38\\u5ba2\\u5728\\u65c5\\u6e38\\u8fc7\\u7a0b\\u4e2d\\u5e94\\u5c0a\\u91cd\\u65c5\\u6e38\\u5730\\u7684\\u98ce\\u571f\\u4eba\\u60c5\\u548c\\u6c11\\u65cf\\u4e60\\u4fd7\\uff0c\\u7ef4\\u62a4\\u73af\\u5883\\u536b\\u751f\\uff0c\\u9075\\u5b88\\u516c\\u5171\\u79e9\\u5e8f\\uff0c\\u4fdd\\u62a4\\u751f\\u6001\\u73af\\u5883\\u548c\\u6587\\u7269\\u53e4\\u8ff9\\uff0c\\u5c0a\\u91cd\\u4ed6\\u4eba\\uff0c\\u4ee5\\u793c\\u5f85\\u4eba\\u3002\\r\\n5\\u3001\\u6e38\\u5ba2\\u5e94\\u9075\\u5b88\\u56e2\\u961f\\u7eaa\\u5f8b\\u3001\\u914d\\u5408\\u9886\\u961f\\u3001\\u5bfc\\u6e38\\u5de5\\u4f5c\\u3002\\u56e0\\u81ea\\u8eab\\u75be\\u75c5\\u7b49\\u539f\\u56e0\\u4e0d\\u80fd\\u968f\\u56e2\\u524d\\u884c\\uff0c\\u9700\\u4e66\\u9762\\u7533\\u8bf7\\u5e76\\u7ecf\\u9886\\u961f\\u3001\\u5bfc\\u6e38\\u7b7e\\u5b57\\u540c\\u610f\\uff0c\\u5982\\u672a\\u7ecf\\u4e66\\u9762\\u540c\\u610f\\u800c\\u64c5\\u81ea\\u79bb\\u56e2\\uff0c\\u6240\\u9020\\u6210\\u7684\\u4eba\\u8eab\\u548c\\u8d22\\u4ea7\\u635f\\u5931\\uff0c\\u65c5\\u884c\\u793e\\u6982\\u4e0d\\u627f\\u62c5\\u8d23\\u4efb\\u3002\\u65c5\\u6e38\\u884c\\u7a0b\\u5916\\u51fa\\u6e38\\u8bf7\\u7ed3\\u4f34\\u540c\\u884c\\u3002\\r\\n6\\u3001\\u6e38\\u5ba2\\u5e94\\u9075\\u7eaa\\u5b88\\u6cd5\\uff0c\\u9075\\u5b88\\u4ea4\\u901a\\u89c4\\u5219\\uff0c\\u8b66\\u60d5\\u4e0a\\u5f53\\u53d7\\u9a97\\uff0c\\u9632\\u6b62\\u88ab\\u5077\\u88ab\\u62a2\\uff0c\\u4e0d\\u53c2\\u4e0e\\u8d4c\\u535a\\uff0c\\u5438\\u6bd2\\uff0c\\u4e0d\\u6d89\\u8db3\\u8272\\u60c5\\u573a\\u6240\\u3002\\r\\n7\\u3001\\u672a\\u6210\\u5e74\\u4eba\\u53c2\\u52a0\\u65c5\\u6e38\\u6d3b\\u52a8\\uff0c\\u987b\\u4e8b\\u5148\\u5f81\\u5f97\\u65c5\\u884c\\u793e\\u540c\\u610f\\uff0c\\u5e76\\u7531\\u6cd5\\u5b9a\\u76d1\\u62a4\\u4eba\\u966a\\u540c\\u51fa\\u6e38\\u3002\\u76d1\\u62a4\\u4eba\\u8d1f\\u8d23\\u672a\\u6210\\u5e74\\u4eba\\u65c5\\u6e38\\u8fc7\\u7a0b\\u4e2d\\u7684\\u5b89\\u5168\\u95ee\\u9898\\u3002\\r\\n8\\u3001\\u4e2d\\u8001\\u5e74\\u4eba\\u5c24\\u5176\\u662f\\u60a3\\u75c5\\u8005\\u53c2\\u52a0\\u65c5\\u6e38\\uff0c\\u987b\\u5982\\u5b9e\\u5411\\u65c5\\u884c\\u793e\\u63d0\\u4f9b\\u5065\\u5eb7\\u4fe1\\u606f\\uff0c\\u5e76\\u6839\\u636e\\u81ea\\u5df1\\u7684\\u5065\\u5eb7\\u72b6\\u51b5\\u91cf\\u529b\\u800c\\u884c\\u3002\\u5982\\u6e38\\u5ba2\\u611f\\u89c9\\u8eab\\u4f53\\u4e0d\\u9002\\uff0c\\u8bf7\\u9a6c\\u4e0a\\u544a\\u77e5\\u5bfc\\u6e38\\u3002\\u56e0\\u4e2d\\u8001\\u5e74\\u65c5\\u5ba2\\u8eab\\u4f53\\u539f\\u56e0\\u4ea7\\u751f\\u7684\\u4e00\\u5207\\u540e\\u679c\\u4e0e\\u8d23\\u4efb\\uff0c\\u65c5\\u884c\\u793e\\u6982\\u4e0d\\u627f\\u62c5\\u3002\\r\\n\\u203b \\u98df\\u5bbf\\u987b\\u77e5\\r\\n1\\u3001\\u5165\\u4f4f\\u5bbe\\u9986\\u623f\\u95f4\\u65f6\\u8bf7\\u5148\\u67e5\\u770b\\u5ba2\\u623f\\u7269\\u54c1\\u6e05\\u5355\\uff0c\\u5982\\u53d1\\u73b0\\u7f3a\\u5c11\\uff0c\\u53ca\\u65f6\\u4e0e\\u5bfc\\u6e38\\u548c\\u5ba2\\u623f\\u670d\\u52a1\\u5458\\u8054\\u7cfb\\u3002\\r\\n2\\u3001\\u8bf7\\u4ed4\\u7ec6\\u8fa8\\u522b\\u9152\\u5e97\\u3001\\u5ba2\\u623f\\u5185\\u7684\\u7269\\u54c1\\u662f\\u5426\\u4e3a\\u6709\\u507f\\u7269\\u54c1\\u3002\\u9664\\u5ba2\\u623f\\u5185\\u4e00\\u6b21\\u6027\\u7528\\u54c1\\u5916\\uff0c\\u9152\\u5e97\\u7269\\u54c1\\u8bf7\\u52ff\\u968f\\u610f\\u5e26\\u8d70\\u6216\\u635f\\u574f\\u3002\\r\\n3\\u3001\\u4f7f\\u7528\\u5ba2\\u623f\\u5185\\u6536\\u8d39\\u7269\\u54c1\\u6216\\u6536\\u8d39\\u7535\\u89c6\\u7b49\\uff0c\\u8bf7\\u770b\\u6e05\\u4ef7\\u683c\\u540e\\u518d\\u4f7f\\u7528\\u3002\\r\\n4\\u3001\\u5404\\u5730\\u5bbe\\u9986\\u8bbe\\u65bd\\u5747\\u6709\\u5dee\\u5f02\\uff0c\\u5982\\u6d74\\u5ba4\\u5185\\u65e0\\u9632\\u6ed1\\u57ab\\uff0c\\u6d17\\u6fa1\\u65f6\\u8bf7\\u7279\\u522b\\u6ce8\\u610f\\u5b89\\u5168\\uff0c\\u9632\\u6b62\\u6ed1\\u5012\\uff0c\\u8001\\u4eba\\u51ac\\u5b63\\u6d17\\u6fa1\\u65f6\\u95f4\\u4e0d\\u5b9c\\u8fc7\\u957f\\u3002\\r\\n5\\u3001\\u6e38\\u5ba2\\u54c1\\u5c1d\\u5f53\\u5730\\u7f8e\\u98df\\uff0c\\u8bf7\\u6839\\u636e\\u81ea\\u8eab\\u80a0\\u80c3\\u60c5\\u51b5\\u800c\\u5b9a\\uff0c\\u6ce8\\u610f\\u996e\\u98df\\u996e\\u6c34\\u536b\\u751f\\uff0c\\u5207\\u52ff\\u66b4\\u996e\\u66b4\\u98df\\u3002\\r\\n6\\u3001\\u65c5\\u6e38\\u80dc\\u5730\\u3001\\u6d77\\u8fb9\\u6c99\\u6ee9\\u7b49\\u5730\\uff0c\\u5c0f\\u5546\\u4e91\\u96c6\\uff0c\\u8bf7\\u52ff\\u8ddf\\u62c9\\u5ba2\\u8005\\u53bb\\u6392\\u6321\\u6216\\u996d\\u5e97\\u7528\\u9910\\uff0c\\u4ee5\\u514d\\u88ab\\u5bb0\\u3002\\r\\n7\\u3001\\u5728\\u5ba4\\u5185\\u6e38\\u6cf3\\u6c60\\u6e38\\u6cf3\\u65f6\\u5207\\u5fcc\\u8df3\\u6c34\\uff0c\\u6e38\\u6cf3\\u8fc7\\u540e\\u52ff\\u98df\\u6c34\\u679c\\u3002","warning":null,"islogicdelete":"1","createuserid":"12139","createtime":"2017-02-10 08:49:14","timestamp":"2017-02-10 08:49:15"}
     * data_team : []
     * data_journey : [{"id":"65527","linesid":"13510","guid":"ddc19cce-b357-4b1e-b751-3f3510670e11418103","linesguid":"ddc19cce-b357-4b1e-b751-3f3510670e11","journey_day":"1","journey_details":"\\u6e38\\u5ba2\\u6839\\u636e\\u822a\\u73ed\\u65f6\\u95f4\\u524d\\u5f80\\u5e38\\u5dde\\u5954\\u725b\\u673a\\u573a\\uff0c\\u7ec8\\u4e8e\\u5982\\u7ea6\\u642d\\u4e58\\u98de\\u673a\\uff0c\\u968f\\u5373\\u4e58\\u673a\\u98de\\u5f80\\u6cf0\\u56fd\\u9996\\u90fd\\u66fc\\u8c37\\uff0c\\u62b5\\u8fbe\\u540e\\u4e13\\u8f66\\u9001\\u5f80\\u9152\\u5e97\\u4f11\\u606f\\uff0c\\u4ee5\\u5907\\u4e4b\\u540e\\u7cbe\\u5f69\\u7eb7\\u5448\\u7684\\u6cf0\\u56fd\\u4e4b\\u65c5\\u3002","journey_basic_info":"\\u5e38\\u5dde[plane]\\u66fc\\u8c37 \\u53c2\\u8003\\u822a\\u73ed\\uff1aSL8049 19:00-22:45","journey_break_fast":"\\u656c\\u8bf7\\u81ea\\u7406","journey_lunch":"\\u656c\\u8bf7\\u81ea\\u7406","journey_dinner":"\\u656c\\u8bf7\\u81ea\\u7406","journey_lodging":"\\u66fc\\u8c37\\u5f53\\u5730\\u4e94\\u661f\\u9152\\u5e97","journey_day_sight":null,"journey_day_shopping":null,"journey_day_sightself":null,"journey_day_activity":null,"createuserid":"10274","createtime":"2017-01-24 15:57:00","timestamp":"0000-00-00 00:00:00","islogicdelete":"1","journey_details_listall":[]},{"id":"65528","linesid":"13510","guid":"ddc19cce-b357-4b1e-b751-3f3510670e11418104","linesguid":"ddc19cce-b357-4b1e-b751-3f3510670e11","journey_day":"2","journey_details":"\\u4e0a\\u5348\\uff1a\\u65e9\\u9910\\u540e\\uff0c\\u89c2\\u8c61\\u5f81\\u66fc\\u8c37\\u738b\\u671d\\u8f89\\u714c\\u660c\\u76db\\u7684\\u3010\\u5927\\u7687\\u5bab\\u3011\\u548c\\u4f9b\\u5949\\u56fd\\u5b9d\\u201c\\u7fe1\\u7fe0\\u7389\\u4f5b\\u201d\\u7684\\u3010\\u7389\\u4f5b\\u5bfa\\u3011\\uff0c\\u8be5\\u7389\\u4f5b\\u9ad866\\u5398\\u7c73\\uff0c\\u961448\\u5398\\u7c73\\uff0c\\u662f\\u7531\\u4e00\\u6574\\u5757\\u78a7\\u7389\\u96d5\\u523b\\u800c\\u6210\\uff0c\\u4e43\\u4e16\\u95f4\\u5c11\\u6709\\u4e4b\\u73cd\\u5b9d\\u3002\\u4e4b\\u540e\\u6e38\\u89c8\\u3010\\u6e44\\u5357\\u6cb3\\u6c34\\u4e0a\\u5e02\\u573a\\u3011\\uff0c\\u6e44\\u5357\\u6cb3\\u98ce\\u5149\\u6700\\u5177\\u7279\\u8272\\u7684\\u662f\\u6c34\\u4e0a\\u5e02\\u573a\\uff0c\\u6c7d\\u8247\\u548c\\u5927\\u5c0f\\u6728\\u8239\\u4ee3\\u66ff\\u4e86\\u5404\\u79cd\\u5927\\u5c0f\\u8f66\\u8f86\\u3002\\u8239\\u4e0a\\u6ee1\\u8f7d\\u7740\\u4e30\\u5bcc\\u7684\\u519c\\u4ea7\\u54c1\\u3001\\u5de5\\u827a\\u54c1\\u7b49\\uff0c\\u5356\\u4e3b\\u5728\\u8239\\u4e0a\\u5c55\\u51fa\\u5404\\u79cd\\u5546\\u54c1\\u53eb\\u5356\\uff0c\\u4e70\\u4e3b\\u4e5f\\u5212\\u7740\\u8239\\u524d\\u5f80\\u9009\\u8d2d\\u6240\\u9700\\u7684\\u5546\\u54c1\\uff0c\\u4e70\\u5356\\u7684\\u8239\\u53ea\\uff0c\\u5212\\u5212\\u505c\\u505c\\uff0c\\u4e0d\\u53d7\\u9650\\u5236\\uff0c\\u8ba8\\u4ef7\\u8fd8\\u4ef7\\u58f0\\u3002<br \\/>\\n\\u4e0b\\u5348\\uff1a\\u9971\\u9910\\u4e4b\\u540e\\u524d\\u5f80\\u53c2\\u89c2\\u3010\\u963f\\u5357\\u8fbe\\u3011\\u6c99\\u739b\\u7a7a\\u7687\\u5bb6\\u5fa1\\u4f1a\\u9986\\u8fd9\\u662f\\u4e00\\u5ea7\\u767d\\u8272\\u4e3a\\u4e3b\\u7684\\u610f\\u5927\\u5229\\u6587\\u827a\\u590d\\u5174\\u5f0f\\u7684\\u5efa\\u7b51\\u3002\\u5ba4\\u5185\\u5168\\u4ee5\\u5f69\\u8272\\u5927\\u7406\\u77f3\\u88c5\\u9970\\uff0c\\u6709\\u6cf0\\u56fd\\u5386\\u53f2\\u6f14\\u8fdb\\u7684\\u58c1\\u753b\\u3002\\uff08\\u8be5\\u9986\\u6bcf\\u9022\\u5468\\u4e00\\u95ed\\u9986\\uff0c\\u6211\\u793e\\u4f1a\\u6839\\u636e\\u5b9e\\u9645\\u60c5\\u51b5\\u53e6\\u4f5c\\u8c03\\u6574\\uff09\\u3002","journey_basic_info":"\\u66fc\\u8c37","journey_break_fast":"\\u9152\\u5e97\\u5185","journey_lunch":"\\u6807\\u51c6\\u9910","journey_dinner":"\\u6807\\u51c6\\u9910","journey_lodging":"\\u66fc\\u8c37\\u5f53\\u5730\\u4e94\\u661f\\u9152\\u5e97","journey_day_sight":"\\u5927\\u7687\\u5bab\\uff0c\\u7389\\u4f5b\\u5bfa\\uff0c\\u6e44\\u5357\\u6cb3\\u6c34\\u4e0a\\u5e02\\u573a\\uff0c\\u963f\\u5357\\u8fbe","journey_day_shopping":null,"journey_day_sightself":null,"journey_day_activity":null,"createuserid":"10274","createtime":"2017-01-24 15:57:00","timestamp":"0000-00-00 00:00:00","islogicdelete":"1","journey_details_listall":[]},{"id":"65529","linesid":"13510","guid":"ddc19cce-b357-4b1e-b751-3f3510670e11418105","linesguid":"ddc19cce-b357-4b1e-b751-3f3510670e11","journey_day":"3","journey_details":"\\u4e0a\\u5348\\uff1a\\u65e9\\u9910\\u540e\\uff0c\\u524d\\u5f80\\u66fc\\u8c37\\u7684\\u6cf0\\u56fd\\u73e0\\u5b9d\\u5c55\\u793a\\u4e2d\\u5fc3\\uff0c\\u6b64\\u5904\\u4e00\\u76f4\\u4e0d\\u65ad\\u63a8\\u51fa\\u6700\\u7b26\\u5408\\u6f6e\\u6d41\\u6b3e\\u5f0f\\u4e14\\u5b9e\\u7528\\u517c\\u5177\\u7684\\u73e0\\u5b9d\\uff0c\\u6765\\u6ee1\\u8db3\\u4e0d\\u540c\\u5e74\\u9f84\\u5c42\\u3001\\u4e0d\\u540c\\u9700\\u6c42\\u7684\\u5ba2\\u6237\\uff0c\\u60a8\\u53ef\\u653e\\u5fc3\\u5728\\u6b64\\u5904\\u968f\\u610f\\u9009\\u8d2d\\u3002\\u63a5\\u7740\\u7eed\\u524d\\u5f80\\u76ae\\u9769\\u5c55\\u793a\\u4e2d\\u5fc3\\uff0c\\u81ea\\u7531\\u9009\\u62e9\\u8d2d\\u7531\\u9cc4\\u9c7c\\u76ae\\u6216\\u73cd\\u73e0\\u9c7c\\u76ae\\u5236\\u6210\\u7684\\u5404\\u5f0f\\u76ae\\u5305\\u76ae\\u5177\\u3002<br \\/>\\n\\u4e0b\\u5348\\uff1a\\u5348\\u9910\\u540e\\uff0c\\u524d\\u5f80\\u4e1c\\u65b9\\u590f\\u5a01\\u5937\\u4e4b\\u79f0\\u7684\\u5ea6\\u5047\\u80dc\\u5730\\u2014\\u2014\\u82ad\\u5824\\u96c5\\u3002<br \\/>\\n\\u6cbf\\u9014\\u5148\\u7279\\u522b\\u5b89\\u6392\\u5404\\u4f4d\\u4eab\\u53d7\\u4e1b\\u6797\\u3010\\u9a91\\u5927\\u8c61\\u3011\\u3001\\u3010\\u9cc4\\u9c7c\\u8868\\u6f14\\u3011\\u7684\\u4e50\\u8da3\\u3002\\u540e\\u53c2\\u89c2\\u3010\\u4e03\\u73cd\\u4f5b\\u5c71\\u3011\\u4eff\\u4f5b\\u4e00\\u65a7\\u5288\\u5f00\\u534a\\u5c71\\u3001\\u9576\\u4e0a\\u91d1\\u7c89\\u91d1\\u7b94\\u7684\\u5927\\u58c1\\u4f5b\\uff0c\\u3010\\u4e5d\\u4e16\\u7687\\u5e99\\u3011\\u662f\\u5f53\\u4eca\\u56fd\\u738b\\u6700\\u7231\\u7684\\u5e99\\u5b87\\uff0c\\u5e99\\u4e2d\\u4f9b\\u5949\\u7740\\u9ad8\\u50e7\\u7684\\u820d\\u5229\\u5b50\\uff0c\\u4f11\\u606f\\u4e00\\u4e0b\\u518d\\u524d\\u5f80\\u6829\\u6829\\u5982\\u751f\\u7684\\u3010\\u8721\\u50cf\\u9986\\u3011\\u53c2\\u89c2\\uff0c\\u8721\\u50cf\\u662f\\u6cf0\\u56fd\\u8457\\u540d\\u7684\\u5e08\\u7236\\u7cbe\\u5fc3\\u96d5\\u523b\\u800c\\u6210\\uff0c\\u8ba9\\u60a8\\u89c9\\u5f97\\u72b9\\u5982\\u771f\\u4eba\\u822c\\u4e00\\u6837\\u3002","journey_basic_info":"\\u66fc\\u8c37[bus]\\u82ad\\u63d0\\u96c5","journey_break_fast":"\\u9152\\u5e97\\u5185","journey_lunch":"\\u6807\\u51c6\\u9910","journey_dinner":"\\u6807\\u51c6\\u9910","journey_lodging":"\\u82ad\\u63d0\\u96c5\\u5f53\\u5730\\u4e94\\u661f\\u9152\\u5e97","journey_day_sight":"\\u9a91\\u5927\\u8c61\\uff0c\\u9cc4\\u9c7c\\u8868\\u6f14\\uff0c\\u4e03\\u73cd\\u4f5b\\u5c71\\uff0c\\u4e5d\\u4e16\\u7687\\u5e99\\uff0c\\u8721\\u50cf\\u9986","journey_day_shopping":"\\u73e0\\u5b9d\\u5c55\\u793a\\u4e2d\\u5fc3\\uff08\\u7ea690\\u5206\\u949f\\uff09\\uff0c\\u76ae\\u9769\\u5c55\\u793a\\u4e2d\\u5fc3\\uff08\\u7ea690\\u5206\\u949f\\uff09","journey_day_sightself":null,"journey_day_activity":null,"createuserid":"10274","createtime":"2017-01-24 15:57:00","timestamp":"0000-00-00 00:00:00","islogicdelete":"1","journey_details_listall":[]},{"id":"65530","linesid":"13510","guid":"ddc19cce-b357-4b1e-b751-3f3510670e11418106","linesguid":"ddc19cce-b357-4b1e-b751-3f3510670e11","journey_day":"4","journey_details":"\\u4e0a\\u5348\\uff1a\\u65e9\\u9910\\u540e\\u7a7f\\u7740\\u8f7b\\u677e\\u7684\\u8863\\u88f3\\u5e26\\u4e0a\\u8273\\u4e3d\\u7684\\u6cf3\\u8863\\uff0c\\u642d\\u4e58\\u5feb\\u8247\\u51fa\\u6d77\\uff0c\\u524d\\u5f80\\u3010\\u91d1\\u6c99\\u5c9b\\u3011\\uff0c\\u8fd9\\u8be5\\u5c9b\\u6c99\\u767d\\u7ec6\\u7ef5\\uff0c\\u6c34\\u6e05\\u89c1\\u5e95\\uff0c\\u5c9b\\u4e0a\\u81ea\\u7531\\u6d3b\\u52a8\\uff0c\\u56e2\\u53cb\\u53ef\\u5c3d\\u60c5\\u4eab\\u53d7\\u9633\\u5149\\u6d77\\u6d74\\u6216\\u81ea\\u884c\\u53c2\\u52a0\\u6c34\\u4e0a\\u6d3b\\u52a8\\uff08\\u6c34\\u4e0a\\u6d3b\\u52a8\\u5177\\u6709\\u4e00\\u5b9a\\u5371\\u9669\\u6027\\u4e14\\u4e0d\\u5728\\u610f\\u5916\\u9669\\u7406\\u8d54\\u8303\\u56f4\\u5185\\uff0c\\u8bf7\\u56e2\\u53cb\\u6839\\u636e\\u81ea\\u5df1\\u7684\\u8eab\\u4f53\\u72b6\\u51b5\\u8fdb\\u884c\\u5b89\\u6392\\uff09\\u3002<br \\/>\\n\\u4e0b\\u5348\\uff1a\\u53c2\\u89c2\\u539f\\u77f3\\u6cf0\\u4e1d\\u9986<br \\/>\\n\\u665a\\u95f4\\uff1a\\u665a\\u4e0a\\u8282\\u76ee\\u66f4\\u5177\\u6cf0\\u56fd\\u98ce\\u683c\\uff0c\\u3010\\u4e1c\\u65b9\\/\\u66b9\\u7f57\\u516c\\u4e3b\\u53f7\\u3011\\u662f\\u5916\\u56fd\\u6e38\\u5ba2\\u5fc5\\u53bb\\u573a\\u6240\\uff0c\\u95fb\\u540d\\u9050\\u8fe9\\u7684\\u5e76\\u4e0d\\u662f\\u66b9\\u7f57\\u6e7e\\u591c\\u666f\\uff0c\\u800c\\u662f\\u4e1c\\u65b9\\u516c\\u4e3b\\u4eec\\u7684\\u7f8e\\u4e3d\\u3002\\u6cf0\\u56fd\\u4eba\\u5996\\u7684\\u7cbe\\u6e5b\\u6b4c\\u821e\\u8868\\u6f14\\u4ee4\\u5f88\\u591a\\u4eba\\u5bf9\\u53f0\\u4e0a\\u7684\\u4e3d\\u4eba\\u4eec\\u96cc\\u96c4\\u96be\\u8fa8\\uff0c\\u5728\\u8239\\u4e0a\\u6211\\u4eec\\u5c06\\u4e0e\\u5979\\u4eec\\u8fd1\\u8ddd\\u79bb\\u63a5\\u89e6\\u3002\\u968f\\u540e\\u6b65\\u884c\\u3010\\u5609\\u5e74\\u534e\\u98ce\\u6708\\u8857\\u3011\\uff0c\\u8fd9\\u662f\\u6bcf\\u4e00\\u4e2a\\u5230\\u82ad\\u63d0\\u96c5\\u7684\\u6e38\\u5ba2\\u5fc5\\u53bb\\u7684\\u5730\\u65b9\\u3002\\u5b83\\u7684\\u771f\\u6b63\\u9b45\\u529b\\u5728\\u4e8e\\u653e\\u7eb5\\u7684\\u591c\\u751f\\u6d3b\\u4ee5\\u53ca\\u7279\\u8272\\u4eba\\u5996\\u3002\\u4e5f\\u6709\\u53ef\\u4ee5\\u6b23\\u8d4f\\u97f3\\u4e50\\u7684\\u5496\\u5561\\u5427\\u548c\\u9152\\u5427\\u3002\\u8d70\\u8d70\\u901b\\u901b\\uff0c\\u611f\\u53d7\\u5929\\u5802\\u548c\\u5730\\u72f1\\u7684\\u7ed3\\u5408\\u57ce\\u5e02\\u3002<br \\/>\\n\\u968f\\u540e\\u5e26\\u9886\\u60a8\\u6765\\u8d9f\\u5145\\u5206\\u4f53\\u9a8c\\u8eab\\u5fc3\\u653e\\u677e\\u7684\\u3010\\u6cf0\\u5f0f\\u53e4\\u6cd5\\u6307\\u538b\\u6309\\u6469\\u3011\\uff0c\\u8ba9\\u60a8\\u4eab\\u53d7\\u4e00\\u5957\\u7531\\u4e13\\u4e1a\\u7684\\u6309\\u6469\\u5e08\\u4e3a\\u60a8\\u4eb2\\u5207\\u7ec6\\u5fc3\\u7684\\u670d\\u52a1\\uff0c\\u758f\\u89e3\\u60a8\\u8fde\\u65e5\\u6765\\u7684\\u65c5\\u9014\\u75b2\\u52b3\\u3002\\u6cf0\\u5f0f\\u6309\\u6469\\u662f\\u6cf0\\u56fd\\u6570\\u767e\\u5e74\\u7684\\u91cd\\u8981\\u6587\\u5316\\u9057\\u4ea7\\u4e4b\\u4e00\\uff0c\\u4e3a\\u6cf0\\u56fd\\u53e4\\u4ee3\\u533b\\u5b66\\u6587\\u5316\\u4e4b\\u4e00\\uff0c\\u62e5\\u6709\\u56db\\u5343\\u591a\\u5e74\\u5386\\u53f2\\uff0c\\u6e90\\u8fdc\\u6d41\\u957f\\u3002\\u53e4\\u4ee3\\u6cf0\\u56fd\\u7687\\u65cf\\u5229\\u7528\\u5b83\\u4f5c\\u4e3a\\u5f3a\\u8eab\\u5065\\u4f53\\u548c\\u6cbb\\u7597\\u8eab\\u4f53\\u52b3\\u635f\\u65b9\\u6cd5\\u4e4b\\u4e00\\u3002\\u8fd1\\u5e74\\u6765\\u7ecf\\u8fc7\\u6cf0\\u56fd\\u653f\\u5e9c\\u76d1\\u7ba1\\u53d1\\u5c55\\u548c\\u79ef\\u6781\\u63a8\\u5e7f\\u7684\\u60c5\\u51b5\\u4e0b\\uff0c\\u6cf0\\u5f0f\\u6309\\u6469\\u5df2\\u5e7f\\u4e3a\\u4eba\\u77e5\\uff0c\\u6210\\u4e3a\\u53d7\\u4e2d\\u5916\\u91cd\\u89c6\\u7684\\u5929\\u7136\\u6cbb\\u7597\\u3002<br \\/>\\n\\u5907\\u6ce8\\uff1a<br \\/>\\n1\\u300116\\u5c81\\u4ee5\\u4e0b\\u7684\\u5c0f\\u5b69\\u56e0\\u9aa8\\u9abc\\u4ecd\\u5728\\u6210\\u957f\\u9636\\u6bb5\\uff0c\\u4e3a\\u907f\\u514d\\u5f71\\u54cd\\uff0c\\u6055\\u4e0d\\u63d0\\u4f9b\\u672c\\u9879\\u6d3b\\u52a8\\uff0c\\u4ea6\\u4e0d\\u53ef\\u8f6c\\u8ba9\\u4ed6\\u4eba\\u3002<br \\/>\\n2\\u3001\\u56e0\\u9879\\u76ee\\u4e3a\\u514d\\u8d39\\u8d60\\u9001\\uff0c\\u672a\\u53c2\\u52a0\\u672c\\u9879\\u6d3b\\u52a8\\u7684\\u65c5\\u5ba2\\u4e0d\\u53ef\\u8981\\u6c42\\u9000\\u8d39\\u6216\\u4ee5\\u5176\\u4ed6\\u81ea\\u8d39\\u6d3b\\u52a8\\u6216\\u975e\\u81ea\\u8d39\\u6d3b\\u52a8\\u8981\\u6c42\\u8865\\u507f\\u3002","journey_basic_info":"\\u82ad\\u63d0\\u96c5","journey_break_fast":"\\u9152\\u5e97\\u5185","journey_lunch":"\\u6807\\u51c6\\u9910","journey_dinner":"\\u6807\\u51c6\\u9910","journey_lodging":"\\u82ad\\u63d0\\u96c5\\u5f53\\u5730\\u4e94\\u661f\\u9152\\u5e97","journey_day_sight":"\\u91d1\\u6c99\\u5c9b\\uff0c\\u4e1c\\u65b9\\/\\u66b9\\u7f57\\u516c\\u4e3b\\u53f7\\uff0c\\u5609\\u5e74\\u534e\\u98ce\\u6708\\u8857\\uff0c\\u6cf0\\u5f0f\\u53e4\\u6cd5\\u6307\\u538b\\u6309\\u6469","journey_day_shopping":"\\u539f\\u77f3\\u6cf0\\u4e1d\\u9986\\uff08\\u7ea660\\u5206\\u949f\\uff09","journey_day_sightself":null,"journey_day_activity":null,"createuserid":"10274","createtime":"2017-01-24 15:57:00","timestamp":"0000-00-00 00:00:00","islogicdelete":"1","journey_details_listall":[]},{"id":"65531","linesid":"13510","guid":"ddc19cce-b357-4b1e-b751-3f3510670e11418107","linesguid":"ddc19cce-b357-4b1e-b751-3f3510670e11","journey_day":"5","journey_details":"\\u4e0a\\u5348\\uff1a\\u65e9\\u9910\\u540e\\uff0c\\u4e58\\u5750\\u65c5\\u6e38\\u5df4\\u58eb\\u8fd4\\u56de\\u66fc\\u8c37\\uff0c\\u9014\\u4e2d\\u53c2\\u89c2\\u3010\\u795e\\u6bbf\\u5bfa\\u3011\\uff0c\\u3010\\u795e\\u6bbf\\u5bfa\\u3011\\u4f4d\\u4e8e\\u82ad\\u5824\\u96c5\\u4e0e\\u66fc\\u8c37\\u4e4b\\u95f4\\uff0c\\u5bfa\\u5185\\u4f9b\\u5949\\u6709\\u4e00\\u5c0a\\u56db\\u9762\\u4f5b\\uff0c\\u636e\\u8bf4\\u3010\\u795e\\u6bbf\\u5bfa\\u3011\\u7684\\u56db\\u9762\\u4f5b\\u975e\\u5e38\\u7075\\u9a8c\\uff0c\\u4eba\\u79f0\\u201c\\u6709\\u6c42\\u5fc5\\u5e94\\u4f5b\\u201d\\uff0c\\u6240\\u4ee5\\u9999\\u706b\\u4e00\\u76f4\\u5f88\\u65fa\\u3002\\u8be5\\u4f5b\\u6709\\u56db\\u5c0a\\u4f5b\\u9762\\uff0c\\u4ece\\u6b63\\u9762\\u5f00\\u59cb\\u987a\\u65f6\\u9488\\u4f9d\\u6b21\\u4e3a\\uff1a\\u5065\\u5eb7\\u5e73\\u5b89\\u3001\\u4e8b\\u4e1a\\u6709\\u6210\\u3001\\u5a5a\\u59fb\\u7f8e\\u6ee1\\u3001\\u8d22\\u8fd0\\u4ea8\\u901a\\u3002\\u6b64\\u4f5b\\u53ef\\u638c\\u7ba1\\u4eba\\u4e16\\u95f4\\u7684\\u4e00\\u5207\\u4e8b\\u7269\\uff0c\\u662f\\u6cf0\\u56fd\\u9999\\u706b\\u6700\\u65fa\\u7684\\u4f5b\\u3002<br \\/>\\n\\u63a5\\u7740\\u524d\\u5f80\\u76db\\u4ea7\\u71d5\\u7a9d\\u7684\\u71d5\\u7a9d\\u4e73\\u80f6\\u4e2d\\u5fc3\\u53c2\\u89c2\\uff0c\\u56ed\\u5185\\u8fd8\\u6709\\u6a61\\u80f6\\u5236\\u54c1\\u53ef\\u4f9b\\u91c7\\u8d2d\\u3002<br \\/>\\n\\u4e0b\\u5348\\uff1a\\u9014\\u5f84\\u571f\\u7279\\u4ea7\\u4f11\\u606f\\u7ad9\\u7a0d\\u505a\\u4f11\\u606f\\uff0c\\u524d\\u5f80\\u6bd2\\u86c7\\u7814\\u7a76\\u4e2d\\u5fc3\\u89c2\\u770b\\u4eba\\u86c7\\u5927\\u6218\\uff0c\\u8ba9\\u4e13\\u4e1a\\u4eba\\u5458\\u4e3a\\u60a8\\u4ecb\\u7ecd\\u5404\\u79cd\\u86c7\\u6bd2\\u5236\\u836f\\u7684\\u795e\\u5947\\u529f\\u6548\\u3002\\u63a5\\u7740\\u53c2\\u89c2\\u3010KING\\u3011 \\u3010POWER\\u56fd\\u9645\\u514d\\u7a0e\\u4e2d\\u5fc3\\u3011\\uff0c \\u6cf0\\u56fd\\u738b\\u6743\\u514d\\u7a0e\\u5e97\\u96b6\\u5c5e\\u4e8e\\u6cf0\\u56fd\\u738b\\u6743\\u56fd\\u9645\\u96c6\\u56e2\\u65d7\\u4e0b\\uff0c\\u6c47\\u805a\\u4f17\\u591a\\u4e16\\u754c\\u65f6\\u5c1a\\u70ed\\u9500\\u54c1\\u724c\\uff0c\\u8d2d\\u7269\\u7a7a\\u95f4\\u4f18\\u96c5\\u8212\\u9002\\uff0c\\u5404\\u79cd\\u4e16\\u754c\\u540d\\u724c\\u5e94\\u6709\\u5c3d\\u6709\\uff0c\\u4efb\\u541b\\u6311\\u9009\\u3002","journey_basic_info":"\\u82ad\\u63d0\\u96c5[bus]\\u66fc\\u8c37","journey_break_fast":"\\u9152\\u5e97\\u5185","journey_lunch":"\\u6807\\u51c6\\u9910","journey_dinner":"\\u6807\\u51c6\\u9910","journey_lodging":"\\u66fc\\u8c37\\u56fd\\u9645\\u4e94\\u661f\\u7ea7\\u9152\\u5e97","journey_day_sight":"\\u795e\\u6bbf\\u5bfa\\uff0cKING POWER\\u56fd\\u9645\\u514d\\u7a0e\\u4e2d\\u5fc3","journey_day_shopping":"\\u71d5\\u7a9d\\u4e73\\u80f6\\u4e2d\\u5fc3\\uff08\\u7ea660\\u5206\\u949f\\uff09\\uff0c\\u571f\\u7279\\u4ea7\\u4f11\\u606f\\u7ad9\\uff08\\u7ea660\\u5206\\u949f\\uff09\\uff0c\\u6bd2\\u86c7\\u7814\\u7a76\\u4e2d\\u5fc3\\uff08\\u7ea660\\u5206\\u949f\\uff09","journey_day_sightself":null,"journey_day_activity":null,"createuserid":"10274","createtime":"2017-01-24 15:57:00","timestamp":"0000-00-00 00:00:00","islogicdelete":"1","journey_details_listall":[]},{"id":"65532","linesid":"13510","guid":"ddc19cce-b357-4b1e-b751-3f3510670e11418108","linesguid":"ddc19cce-b357-4b1e-b751-3f3510670e11","journey_day":"6","journey_details":"\\u5728\\u6307\\u5b9a\\u65f6\\u95f4\\u81f3\\u66fc\\u8c37\\u673a\\u573a\\u96c6\\u5408\\uff0c\\u642d\\u4e58\\u56fd\\u9645\\u822a\\u73ed\\u8fd4\\u56de\\u5e38\\u5dde\\uff0c\\u7ed3\\u675f\\u96be\\u5fd8\\u800c\\u53c8\\u7cbe\\u5f69\\u7684\\u6cf0\\u56fd\\u4e4b\\u884c\\uff0c\\u5f00\\u59cb\\u671f\\u5f85\\u4e0b\\u4e00\\u6b21\\u7684\\u51fa\\u884c\\u3002","journey_basic_info":"\\u66fc\\u8c37[plane]\\u5e38\\u5dde \\u53c2\\u8003\\u822a\\u73ed\\uff1aSL8048 12:10-17:05","journey_break_fast":"\\u9152\\u5e97\\u5185","journey_lunch":"\\u656c\\u8bf7\\u81ea\\u7406","journey_dinner":"\\u656c\\u8bf7\\u81ea\\u7406","journey_lodging":"\\u5bb6","journey_day_sight":null,"journey_day_shopping":null,"journey_day_sightself":null,"journey_day_activity":null,"createuserid":"10274","createtime":"2017-01-24 15:57:00","timestamp":"0000-00-00 00:00:00","islogicdelete":"1","journey_details_listall":[]}]
     * data_related : {"id":"13590","linesid":"13510","guid":"ddc19cce-b357-4b1e-b751-3f3510670e11112752","linesguid":"ddc19cce-b357-4b1e-b751-3f3510670e11","feature":"\\u2605\\u4f4f\\u5bbf\\u5347\\u7ea7\\n\\u5168\\u7a0b\\u6cf0\\u5f0f\\u4e94\\u661f\\u9152\\u5e97\\uff0c\\u66fc\\u8c37\\u5347\\u7ea71\\u665a\\u56fd\\u9645\\u4e94\\u661f\\u9152\\u5e97\\uff01\\n\\u2605\\u884c\\u7a0b\\u5347\\u7ea7\\n\\u5168\\u7a0b\\u76f4\\u98de\\u822a\\u73ed\\uff0c\\u8212\\u9002\\u5b89\\u5168\\u3002\\n\\u8d85\\u503c\\u8d60\\u9001\\u4ef7\\u503c1288\\u5143\\u666f\\u70b9\\u884c\\u7a0b\\n1.\\u62c9\\u739b\\u7687\\u671d\\u5927\\u7687\\u5bab+\\u7389\\u4f5b\\u5bfa\\uff08\\u6cf0\\u56fd\\u5730\\u6807\\u5f0f\\u5efa\\u7b51 \\u91d1\\u78a7\\u8f89\\u714c\\uff09\\n2.\\u963f\\u5357\\u8fbe\\u6c99\\u739b\\u7a7a\\u7687\\u5bb6\\u5fa1\\u4f1a\\u9986 \\n3.\\u7545\\u6e38\\u6e44\\u5357\\u6cb3+\\u6c34\\u4e0a\\u98ce\\u60c5(\\u4f53\\u9a8c\\u6cf0\\u56fd\\u6c34\\u4e0a\\u4eba\\u5bb6\\u7684\\u98ce\\u571f\\u4eba\\u60c5)\\n4.\\u5609\\u5e74\\u534e\\u98ce\\u6708\\u6b65\\u884c\\u8857\\uff08\\u770b\\u5c3d\\u82ad\\u5824\\u96c5\\u591c\\u5e55\\u4e0b\\u7684\\u94c5\\u534e\\uff09\\n5.\\u6b63\\u5b97\\u6cf0\\u5f0f\\u53e4\\u6307\\u538b\\u6cd5\\u6309\\u6469\\uff08\\u8212\\u7f13\\u65c5\\u9014\\u75b2\\u52b3\\uff0c\\u6b63\\u70b9\\uff09\\n6.\\u9a91\\u5927\\u8c61&\\u9cc4\\u9c7c\\u8868\\u6f14\\n7.\\u82ad\\u5824\\u96c5\\u4e09\\u5927\\u5947\\u89c2\\uff08\\u5927\\u5343\\u4e16\\u754c\\u65e0\\u5947\\u4e0d\\u6709\\uff09\\n8.\\u6cf0\\u56fd\\u56fd\\u7cb9-\\u4e1c\\u65b9\\/\\u66b9\\u7f57\\u516c\\u4e3b\\u53f7\\uff08\\u4e0e\\u4eba\\u5996\\u72c2\\u6b22\\u5171\\u821e\\uff09\\n9.\\u91d1\\u6c99\\u5c9b\\n\\u2605\\u670d\\u52a1\\u5347\\u7ea7\\n\\u5168\\u7a0b\\u65e0\\u81ea\\u8d39\\u518d\\u8d60\\u9001\\u6bcf\\u4eba1000\\u5143\\u81ea\\u8d39\\u5238\\uff08\\u5982\\u4e0d\\u53c2\\u52a0\\uff0c\\u89c6\\u4e3a\\u81ea\\u52a8\\u653e\\u5f03\\uff0c\\u4e0d\\u9000\\u4e0d\\u6362\\uff09\\n\\u82ad\\u63d0\\u96c5\\u592a\\u5e73\\u6d0b\\u597d\\u671b\\u89d2\\n\\u4eba\\u5996\\u8868\\u6f14\\n\\u70ed\\u5e26\\u6c34\\u679c\\u56ed\\n\\u68a6\\u5e7b\\u9b54\\u672f\\u5947\\u89c2\\u79c0\\n\\u5e1d\\u738b\\u9910\\u2014\\u9c7c\\u7fc5\\u71d5\\u7a9d\\n3D\\u795e\\u5947\\u7535\\u5f71\\u738b\\u56fd\\u6216\\u82ad\\u5824\\u96c5\\u591c\\u95f4\\u8868\\u6f14","feenotincluded":"\\u56e2\\u8d39\\u4e0d\\u5305\\u542b\\uff1a\\n1\\u3001\\u4e2a\\u4eba\\u62a4\\u7167\\u8d39\\u7528\\uff0c\\u7b7e\\u8bc1\\u8d39\\n2\\u3001\\u56fd\\u5185\\u6bb5\\u4ea4\\u901a\\uff0c\\u673a\\u573a\\u5f80\\u8fd4\\u9700\\u81ea\\u7406\\u3002\\n3\\u3001\\u822a\\u7a7a\\u4fdd\\u9669\\u4ee5\\u53ca\\u884c\\u674e\\u8d85\\u91cd\\u8d39\\u7528\\u53ca\\u6d77\\u5173\\u8bfe\\u7a0e\\u3002\\n4\\u3001\\u884c\\u7a0b\\u4ee5\\u5916\\u89c2\\u5149\\u8282\\u76ee\\u6216\\u81ea\\u8d39\\u6d3b\\u52a8\\u9879\\u76ee\\u3002\\n5\\u3001\\u5404\\u56fd\\u9152\\u7c7b\\u3001\\u6c7d\\u6c34\\u3001\\u6d17\\u8863\\u3001\\u7535\\u62a5\\u3001\\u7535\\u8bdd\\u53ca\\u4e00\\u5207\\u79c1\\u4eba\\u6027\\u8d28\\u4e4b\\u8d39\\u7528\\u3002\\n6\\u3001\\u56e0\\u7f62\\u5de5\\u3001\\u53f0\\u98ce\\u3001\\u822a\\u73ed\\u53d6\\u6d88\\u6216\\u66f4\\u6539\\u65f6\\u95f4\\uff0c\\u4ea4\\u901a\\u5ef6\\u963b\\u53ca\\u5176\\u5b83\\u4e0d\\u5728\\u672c\\u516c\\u53f8\\u63a7\\u5236\\u8303\\u56f4\\u5185\\u60c5\\u51b5\\u6240\\u5bfc\\u81f4\\u7684\\u989d\\u5916\\u8d39\\u7528\\u3002\\n7\\u3001\\u5355\\u623f\\u5dee\\uff0c\\u56e0\\u51fa\\u73b0\\u5355\\u7537\\u5355\\u5973\\u6216\\u8005\\u5ba2\\u4eba\\u8981\\u6c42\\u4e00\\u4eba\\u4e00\\u95f4\\uff0c\\u6216\\u8005\\u4e0d\\u670d\\u4ece\\u9886\\u961f\\u6392\\u623f\\u7684\\u9700\\u8981\\u652f\\u4ed8\\u5355\\u623f\\u5dee\\n\\n\\u884c\\u7a0b\\u4ec5\\u4f9b\\u53c2\\u8003\\uff0c\\u65c5\\u884c\\u793e\\u5728\\u4e0d\\u51cf\\u5c11\\u884c\\u7a0b\\u7684\\u524d\\u63d0\\u4e0b\\uff0c\\u4fdd\\u7559\\u4f9d\\u636e\\u5177\\u4f53\\u60c5\\u51b5\\u53d8\\u66f4\\u884c\\u7a0b\\u987a\\u5e8f\\u548c\\u9152\\u5e97\\u7684\\u6743\\u5229\\uff01\\n\\u4ee5\\u4e0a\\u822a\\u73ed\\u65f6\\u95f4\\u4e3a\\u53c2\\u8003\\u822a\\u73ed\\u65f6\\u95f4\\uff0c\\u5305\\u673a\\u6700\\u7ec8\\u65f6\\u523b\\u4ee5\\u6c11\\u822a\\u5c40\\u6279\\u590d\\u4e3a\\u51c6\\uff01\\uff01\\uff01\\uff01","feeincluded":"\\u56e2\\u8d39\\u5305\\u542b\\uff1a\\n1\\u3001\\u4ea4\\u901a\\uff1a \\u56fd\\u9645\\u5f80\\u8fd4\\u673a\\u7968\\uff08\\u542b\\u7a0e\\uff0c\\u5305\\u62ec\\u56de\\u7a0b\\u673a\\u573a\\u7a0e\\uff09\\uff0c\\u5f53\\u5730\\u7a7a\\u8c03\\u65c5\\u6e38\\u8f66\\u3002\\n2\\u3001\\u4f4f\\u5bbf\\uff1a\\u884c\\u7a0b\\u4e2d\\u53c2\\u8003\\u9152\\u5e97\\n3\\u3001\\u5bfc\\u6e38\\uff1a\\u5f53\\u5730\\u4e2d\\u6587\\u5bfc\\u6e38\\u548c\\u5916\\u7c4d\\u53f8\\u673a\\uff0c\\u56fd\\u5185\\u9886\\u961f\\u5168\\u7a0b\\u8d34\\u5fc3\\u966a\\u540c\\u3002\\n4\\u3001\\u884c\\u7a0b\\u53ca\\u7528\\u9910\\uff1a\\u884c\\u7a0b\\u4e2d\\u6240\\u5217\\u666f\\u70b9\\u53ca\\u7528\\u9910\\u3002\\n5\\u3001\\u4fdd\\u9669\\uff1a\\u65c5\\u884c\\u793e\\u8d23\\u4efb\\u4fdd\\u9669\\uff0c\\u5efa\\u8bae\\u81ea\\u884c\\u8d2d\\u4e70\\u4e2a\\u4eba\\u65c5\\u6e38\\u610f\\u5916\\u9669\\u53ca\\u822a\\u7a7a\\u9669\\u3002","owncharge":null,"notice":"\\u7b7e\\u8bc1\\u987b\\u77e5\\n\\u529e\\u7406\\u7b7e\\u8bc1\\u6240\\u9700\\u6750\\u6599\\uff1a\\u62a4\\u7167\\uff0c\\u5fc5\\u987b\\u4fdd\\u8bc1\\u81ea\\u51fa\\u53d1\\u65e5\\u8d77\\u67096\\u4e2a\\u6708\\u4ee5\\u4e0a\\u6709\\u6548\\u671f\\uff0c\\u53ca\\u8fde\\u7eed\\u4e24\\u9875\\u7a7a\\u767d\\u9875\\u3002\\n\\u82e5\\u56e0\\u4ee5\\u4e0a\\u539f\\u56e0\\u5bfc\\u81f4\\u65e0\\u6cd5\\u51fa\\u5883\\u6216\\u62d2\\u7b7e\\uff0c\\u6211\\u793e\\u4e0d\\u627f\\u62c5\\u4efb\\u4f55\\u8d23\\u4efb\\u3002\\n\\u53c2\\u56e2\\u987b\\u77e5\\n65\\u5468\\u5c81\\u4ee5\\u4e0a\\u8001\\u4eba\\u8bf7\\u63d0\\u4f9b\\u4e09\\u7532\\u533b\\u9662\\u5065\\u5eb7\\u8bc1\\u660e\\u548c\\u5bb6\\u5c5e\\u966a\\u540c\\u4ee5\\u53ca\\u76f4\\u7cfb\\u5bb6\\u5c5e\\u7b7e\\u7684\\u514d\\u8d23\\u534f\\u8bae\\u65b9\\u80fd\\u53c2\\u56e2\\n\\u8bf7\\u4e8e\\u5b9a\\u4f4d\\u786e\\u8ba4\\u540e2\\u5929\\u5185\\u652f\\u4ed8\\u5b9a\\u91d1\\u4eba\\u6c11\\u5e013000\\u5143\\/\\u4eba\\uff0c\\u65b9\\u53ef\\u786e\\u5b9a\\u7559\\u4f4d\\uff1b\\u53e6\\u5916\\u8bf7\\u4e8e\\u51fa\\u53d1\\u524d\\u81f3\\u5c117\\u4e2a\\u5de5\\u4f5c\\u65e5\\u652f\\u4ed8\\u5168\\u6b3e\\uff0c\\u5426\\u5219\\u672c\\u516c\\u53f8\\u6709\\u6743\\u53d6\\u6d88\\u5176\\u5b9a\\u4f4d\\uff0c\\u5df2\\u4ed8\\u4e4b\\u5b9a\\u91d1\\u6055\\u4e0d\\u9000\\u8fd8\\u3002\\n\\u673a\\u4f4d\\u786e\\u5b9a\\u540e\\uff0c\\u51fa\\u53d1\\u524d7\\u5929\\u53d6\\u6d88\\uff0c\\u6263\\u9664\\u5b9a\\u91d1\\u4eba\\u6c11\\u5e013000\\u5143\\/\\u4eba\\uff1b\\u51fa\\u53d1\\u524d7\\u5929\\u81f3\\u51fa\\u53d1\\u5f53\\u65e5\\u53d6\\u6d88\\uff0c\\u6263\\u9664100%\\u5168\\u6570\\u56e2\\u8d39\\u3002\\n\\u5883\\u5916\\u5bfc\\u6e38\\u6709\\u6743\\u89c6\\u5f53\\u5730\\u60c5\\u51b5\\u66f4\\u6539\\u884c\\u7a0b\\u53ca\\u7528\\u9910\\u5730\\u70b9\\uff0c\\u5982\\u65e0\\u4e0d\\u53ef\\u6297\\u62d2\\u56e0\\u7d20\\uff0c\\u5c06\\u4e0d\\u51cf\\u5c11\\u884c\\u7a0b\\u4e0a\\u6240\\u6709\\u666f\\u70b9\\u3002\\u5883\\u5916\\u7684\\u5f53\\u5929\\u884c\\u7a0b\\u5230\\u9152\\u5e97\\u4f11\\u606f\\u4e3a\\u6b62\\uff0c\\u5ba2\\u4eba\\u5982\\u8981\\u79c1\\u81ea\\u5916\\u51fa\\uff0c\\u53d1\\u751f\\u4e00\\u5207\\u610f\\u5916\\uff0c\\u5747\\u4e0e\\u65c5\\u884c\\u793e\\u65e0\\u5173\\u3002\\n\\u4ee5\\u4e0a\\u884c\\u7a0b\\u4ec5\\u4f9b\\u53c2\\u8003\\uff0c\\u6211\\u793e\\u6709\\u6743\\u5728\\u4e0d\\u51cf\\u5c11\\u666f\\u70b9\\u7684\\u60c5\\u51b5\\u4e0b\\uff0c\\u6839\\u636e\\u5b9e\\u9645\\u60c5\\u51b5\\u53d8\\u66f4\\u666f\\u70b9\\u548c\\u4f4f\\u5bbf\\u987a\\u5e8f\\u3002\\n\\u5168\\u7a0b\\u9152\\u5e97\\u4f4f\\u5bbf\\u5747\\u4e3a\\u53cc\\u4eba\\u6807\\u51c6\\u95f4\\uff0c\\u65e0\\u81ea\\u7136\\u5355\\u95f4\\uff0c\\u5982\\u53c2\\u56e2\\u65f6\\u6709\\u5355\\u7537\\u5355\\u5973\\u4ee5\\u52a0\\u5e8a\\u6216\\u62fc\\u623f\\u4e3a\\u4e3b\\u3002\\u5982\\u8981\\u6c42\\u4f4f\\u5355\\u95f4\\uff0c\\u8bf7\\u63d0\\u524d\\u544a\\u77e5\\uff0c\\u5e76\\u8865\\u6536\\u5355\\u623f\\u5dee\\u3002\\u5bf9\\u4e8e\\u9152\\u5e97\\u6709\\u7279\\u6b8a\\u8981\\u6c42\\u7684\\uff08\\u5982\\u8981\\u6c42\\u5927\\u5e8a\\u623f\\u7b49\\uff09\\u8bf7\\u4e8e\\u53c2\\u56e2\\u65f6\\u544a\\u77e5\\u3002\\n\\u6839\\u636e\\u300a\\u65c5\\u6e38\\u6cd5\\u300b\\u89c4\\u5b9a\\uff0c\\u65c5\\u884c\\u8005\\u4e0d\\u5f97\\u8131\\u56e2\\uff0c\\u5982\\u64c5\\u81ea\\u8131\\u56e2\\u3001\\u79bb\\u56e2\\u3001\\u6ede\\u7559\\u7b49\\uff0c\\u65c5\\u884c\\u793e\\u5c06\\u5411\\u516c\\u5b89\\u673a\\u5173\\u3001\\u65c5\\u6e38\\u4e3b\\u7ba1\\u90e8\\u95e8\\u3001\\u6211\\u56fd\\u9a7b\\u5916\\u673a\\u6784\\u62a5\\u544a\\uff0c\\u7531\\u6b64\\u4ea7\\u751f\\u7684\\u4e00\\u5207\\u6cd5\\u5f8b\\u540e\\u679c\\u7531\\u65c5\\u6e38\\u8005\\u627f\\u62c5\\u3002\\n\\u5e26\\u56e2\\u65f6\\u5019\\u5bfc\\u6e38\\u6709\\u6743\\u6839\\u636e\\u5b9e\\u9645\\u60c5\\u51b5\\u66f4\\u6539\\u6e38\\u89c8\\u987a\\u5e8f\\uff0c\\u5982\\u9047\\u653f\\u7b56\\u6027\\u539f\\u56e0\\u6216\\u8005\\u662f\\u6574\\u4fee\\u7b49\\u539f\\u56e0\\u9020\\u6210\\u7684\\u90e8\\u5206\\u666f\\u70b9\\u65e0\\u6cd5\\u6e38\\u89c8\\u8d39\\u7528\\u6982\\u4e0d\\u9000\\u8fd8\\uff0c\\u51c6\\u786e\\u884c\\u7a0b\\u4ee5\\u51fa\\u56e2\\u901a\\u77e5\\u4e3a\\u51c6\\n\\u6e29\\u99a8\\u63d0\\u793a\\n\\u884c\\u7a0b\\u4e2d\\u6240\\u5217\\u822a\\u73ed\\u53f7\\u53ca\\u65f6\\u95f4\\u4ec5\\u4f9b\\u53c2\\u8003\\uff0c\\u5c06\\u6839\\u636e\\u5b9e\\u9645\\u60c5\\u51b5\\u505a\\u51fa\\u5408\\u7406\\u7684\\u8c03\\u6574\\u3002\\n\\u6b64\\u53c2\\u8003\\u884c\\u7a0b\\u548c\\u65c5\\u6e38\\u8d39\\u7528\\uff0c\\u6211\\u516c\\u53f8\\u5c06\\u6839\\u636e\\u53c2\\u56e2\\u4eba\\u6570\\u3001\\u822a\\u73ed\\u3001\\u7b7e\\u8bc1\\u53ca\\u76ee\\u7684\\u5730\\u56fd\\u4e34\\u65f6\\u53d8\\u5316\\u4fdd\\u7559\\u8c03\\u6574\\u7684\\u6743\\u5229\\u3002\\n\\u8d35\\u91cd\\u7269\\u54c1(\\u73b0\\u91d1\\uff0c\\u62a4\\u7167\\u7b49)\\u8bf7\\u968f\\u8eab\\u643a\\u5e26\\u6216\\u5bc4\\u653e\\u5728\\u4f4f\\u5bbf\\u996d\\u5e97\\u7684\\u4fdd\\u9669\\u7bb1\\u5185\\uff0c\\u7d76\\u4e0d\\u53ef\\u653e\\u5728\\u8f66\\u4e0a\\u6216\\u623f\\u95f4\\u5185\\u7b49\\uff0c\\u5982\\u6709\\u9057\\u5931\\u65c5\\u5ba2\\u5fc5\\u987b\\u81ea\\u884c\\u8d1f\\u8d23\\uff0c\\u4e0e\\u63a5\\u5f85\\u65c5\\u884c\\u793e\\u8d23\\u4efb\\u65e0\\u5173\\u3002\\n\\u4f4f\\u5bbf\\u996d\\u5e97\\u5185\\u8bf7\\u5148\\u89c2\\u5bdf\\u7d27\\u6025\\u51fa\\u53e3\\u6240\\u5728\\uff0c\\u82e5\\u662f\\u996d\\u5e97\\u8b66\\u62a5\\u94c3\\u54cd\\uff0c\\u8bf7\\u52ff\\u614c\\u5f20\\u3002\\u5e76\\u8bf7\\u7531\\u7d27\\u6025\\u51fa\\u53e3\\u8fc5\\u901f\\u79bb\\u5f00\\u3002\\u4f11\\u606f\\u65f6\\u8bf7\\u52a0\\u6263\\u623f\\u95f4\\u5185\\u4e4b\\u5b89\\u5168\\u9501\\uff0c\\u5bf9\\u964c\\u751f\\u4eba\\u4e0d\\u8981\\u4e71\\u5f00\\u95e8\\u3002\\u52ff\\u5c06\\u8863\\u7269\\u62ab\\u6302\\u5728\\u996d\\u5e97\\u7684\\u706f\\u4e0a\\uff0c\\u53ca\\u52ff\\u5728\\u5e8a\\u4e0a\\u62bd\\u70df\\uff0c\\u70df\\u8482\\u4e0d\\u80fd\\u4e71\\u4e22\\uff0c\\u4ee5\\u9632\\u9020\\u6210\\u706b\\u707e\\u5f62\\u8d23\\u6216\\u996d\\u5e97\\u7269\\u54c1\\u635f\\u574f\\u800c\\u8981\\u6c42\\u4f4f\\u5ba2\\u8d54\\u8d4f\\u3002\\n\\u996d\\u5e97\\u6e38\\u6cf3\\u6c60\\u5982\\u65f6\\u95f4\\u672a\\u5f00\\u653e\\u53ca\\u65e0\\u6551\\u751f\\u4eba\\u5458\\u5728\\u73b0\\u573a\\uff0c\\u8bf7\\u52ff\\u81ea\\u5165\\u6cf3\\u6c60\\u5185\\uff0c\\u5426\\u5219\\u5982\\u6709\\u610f\\u5916\\u53d1\\u751f\\u987b\\u81ea\\u884c\\u8d1f\\u8d23\\u3002\\n\\u642d\\u4e58\\u8239\\u53ea\\u6216\\u4ece\\u4e8b\\u6c34\\u4e0a\\u6d3b\\u52a8\\u65f6\\uff0c\\u52a1\\u5fc5\\u7a7f\\u4e0a\\u6551\\u751f\\u8863\\uff0c\\u8239\\u53ea\\u884c\\u8d70\\u65f6\\u8bf7\\u52ff\\u8d70\\u52a8\\uff0c\\u5207\\u52ff\\u5c06\\u624b\\u6216\\u811a\\u653e\\u7f6e\\u8239\\u8fb9\\u53d7\\u4f24\\u3002\\u6d77\\u8fb9\\u620f\\u6c34\\uff0c\\u5207\\u52ff\\u8d85\\u8fc7\\u5b89\\u5168\\u8b66\\u6212\\u7ebf\\u7684\\u8303\\u56f4\\u3002\\u6211\\u4eec\\u5fc5\\u987b\\u518d\\u4e09\\u58f0\\u660e\\uff1a\\u53ea\\u6709\\u60a8\\u6700\\u4e86\\u89e3\\u672c\\u8eab\\u7684\\u8eab\\u4f53\\u72b6\\u51b5\\uff0c\\u5982\\u5b55\\u5987\\uff0c\\u5fc3\\u810f\\u75be\\u75c5\\u60a3\\u8005\\uff0c\\u9ad8\\u9f84\\u8005\\uff0c\\u5e7c\\u9f84\\u8005\\uff0c\\u9ad8\\u4f4e\\u8840\\u538b\\u75c5\\u60a3\\u8005\\uff0c\\u6216\\u4efb\\u4f55\\u4e0d\\u9002\\u5408\\u5267\\u70c8\\u8fd0\\u52a8\\u4e4b\\u75be\\u75c5\\u60a3\\u8005\\u7b49\\uff0c\\u7d76\\u5bf9\\u4e0d\\u9002\\u5408\\u53c2\\u52a0\\u4efb\\u4f55\\u6c34\\u4e0a\\u6d3b\\u52a8\\u6216\\u6d6e\\u6f5c\\u6216\\u4e0d\\u9002\\u5e94\\u4e8e\\u60a8\\u4e2a\\u4eba\\u4f53\\u8d28\\u4e4b\\u5176\\u5b83\\u5267\\u70c8\\uff0c\\u523a\\u6fc0\\u6027\\u7684\\u6d3b\\u52a8\\uff0c\\u5982\\u65c5\\u5ba2\\u9690\\u7792\\u4e2a\\u4eba\\u75be\\u75c5\\u6216\\u575a\\u6301\\u53c2\\u52a0\\u4efb\\u4f55\\u6d3b\\u52a8\\u800c\\u5f15\\u81f4\\u610f\\u5916\\uff0c\\u4e00\\u5207\\u540e\\u679c\\u65c5\\u5ba2\\u81ea\\u884c\\u8d1f\\u8d23\\u3002\\n\\u4e0e\\u91ce\\u751f\\u52a8\\u7269\\u5408\\u7167\\u65f6\\uff0c\\u5207\\u52ff\\u4f5c\\u5f04\\u6216\\u62d4\\u52a8\\u7269\\u987b\\u6bdb\\uff0c\\u8bf7\\u542c\\u4ece\\u9a6f\\u517d\\u5e08\\u7684\\u6307\\u5bfc\\uff0c\\u4ee5\\u514d\\u56e0\\u4eba\\u4e3a\\u56e0\\u7d20\\u800c\\u53d1\\u751f\\u610f\\u5916\\u3002\\n\\u4e1c\\u5357\\u4e9a\\u56e0\\u5b63\\u8282\\u6027\\u7684\\u5173\\u7cfb\\uff0c\\u96be\\u514d\\u5ba2\\u4eba\\u4f1a\\u6709\\u6c34\\u571f\\u4e0d\\u670d\\u5076\\u5c14\\u6cfb\\u809a\\u7684\\u72b6\\u51b5\\uff0c\\u8bf7\\u5c3d\\u91cf\\u907f\\u514d\\u98df\\u7528\\u751f\\u51b7\\u98df\\u7269\\uff0c\\u725b\\u5976\\uff0c\\u6930\\u5b50\\uff0c\\u51b0\\u5757\\u7b49\\uff0c\\u98df\\u7269\\u5c3d\\u91cf\\u719f\\u98df\\uff0c\\u5982\\u6709\\u8179\\u6cfb\\u73b0\\u8c61\\u8bf7\\u5c3d\\u901f\\u544a\\u77e5\\u5f53\\u56e2\\u9886\\u961f\\u6216\\u5bfc\\u6e38\\uff0c\\u4e0d\\u8981\\u81ea\\u5df1\\u4e71\\u7528\\u836f\\u7269\\u3002\\n\\u670d\\u52a1\\u6807\\u51c6\\u8bf4\\u660e\\n\\u666f\\u70b9\\u8bf4\\u660e\\uff1a\\u884c\\u7a0b\\u4e2d\\u672a\\u6807\\u6ce8\\u201c\\u5165\\u5185\\u53c2\\u89c2\\u201d\\u7684\\u666f\\u70b9\\u5747\\u4e3a\\u6e38\\u89c8\\u5916\\u89c2\\uff1b\\u5165\\u5185\\u53c2\\u89c2\\u666f\\u70b9\\u5747\\u542b\\u95e8\\u7968\\u3002\\n\\u884c\\u7a0b\\u8bf4\\u660e\\uff1a\\u5982\\u9047\\u90e8\\u5206\\u666f\\u70b9\\u8282\\u5047\\u65e5\\u4f11\\u606f\\u6216\\u5e86\\u5178\\u7b49\\uff0c\\u672c\\u793e\\u6709\\u6743\\u6839\\u636e\\u5b9e\\u9645\\u60c5\\u51b5\\u8c03\\u6574\\u884c\\u7a0b\\u6e38\\u89c8\\u5148\\u540e\\u987a\\u5e8f\\uff0c\\u4ee5\\u5c3d\\u53ef\\u80fd\\u4fdd\\u8bc1\\u6e38\\u89c8\\u5185\\u5bb9\\u3002\\u4f46\\u5ba2\\u89c2\\u56e0\\u7d20\\u9650\\u5236\\u786e\\u5b9e\\u65e0\\u6cd5\\u5b89\\u6392\\u7684\\uff0c\\u672c\\u793e\\u5c06\\u6839\\u636e\\u5b9e\\u9645\\u60c5\\u51b5\\u8fdb\\u884c\\u8c03\\u6574\\uff0c\\u656c\\u8bf7\\u5404\\u4f4d\\u8d35\\u5bbe\\u7406\\u89e3\\u4e0e\\u914d\\u5408\\u3002\\n\\u6309\\u7167\\u4e1c\\u5357\\u4e9a\\u9152\\u5e97\\u60ef\\u4f8b\\uff0c\\u6bcf\\u6807\\u95f4\\u53ef\\u63a5\\u5f85\\u4e24\\u5927\\u4eba\\u5e26\\u4e00\\u4e2a1.2\\u7c73\\u4ee5\\u4e0b\\u513f\\u7ae5\\uff08\\u4e0d\\u5360\\u5e8a\\uff09\\uff0c\\u5177\\u4f53\\u8d39\\u7528\\u6839\\u636e\\u6240\\u62a5\\u56e2\\u961f\\u60c5\\u51b5\\u800c\\u5b9a\\uff1b\\u82e5\\u4e00\\u4e2a\\u5927\\u4eba\\u5e26\\u4e00\\u4e2a1.2\\u7c73\\u4ee5\\u4e0b\\u513f\\u7ae5\\u53c2\\u56e2\\uff0c\\u5efa\\u8bae\\u4f4f\\u4e00\\u6807\\u95f4\\uff0c\\u4ee5\\u514d\\u7ed9\\u5176\\u4ed6\\u6e38\\u5ba2\\u4f11\\u606f\\u9020\\u6210\\u4e0d\\u4fbf\\u3002\\n\\u5728\\u4e1c\\u5357\\u4e9a\\u56fd\\u5bb6\\u4eab\\u53d7\\u670d\\u52a1\\u5e94\\u4ed8\\u5c0f\\u8d39\\u7684\\u89c2\\u5ff5\\u5df2\\u6210\\u4e3a\\u5176\\u6587\\u5316\\u7684\\u4e00\\u90e8\\u5206\\uff0c\\u8bf7\\u5c0a\\u91cd\\u5bfc\\u6e38\\u3001\\u5730\\u966a\\u548c\\u53f8\\u673a\\u7684\\u670d\\u52a1\\uff0c\\u6309\\u60ef\\u4f8b\\u652f\\u4ed8\\u5c0f\\u8d39\\uff0c\\u8c22\\u8c22\\u60a8\\u7684\\u7406\\u89e3\\u548c\\u652f\\u6301\\u3002\\n\\u9000\\u8d39\\u8bf4\\u660e\\n\\u5982\\u9047\\u5929\\u6c14\\u3001\\u6218\\u4e89\\u3001\\u7f62\\u5de5\\u3001\\u5730\\u9707\\u7b49\\u4eba\\u529b\\u4e0d\\u53ef\\u6297\\u529b\\u56e0\\u7d20\\u65e0\\u6cd5\\u6e38\\u89c8\\uff0c\\u6211\\u793e\\u5c06\\u6309\\u7167\\u65c5\\u884c\\u793e\\u534f\\u8bae\\uff0c\\u9000\\u8fd8\\u672a\\u6e38\\u89c8\\u666f\\u70b9\\u95e8\\u7968\\u8d39\\u7528\\uff0c\\u4f46\\u8d60\\u9001\\u9879\\u76ee\\u8d39\\u7528\\u4e0d\\u9000\\uff1b\\u6e38\\u5ba2\\u56e0\\u4e2a\\u4eba\\u539f\\u56e0\\u4e34\\u65f6\\u81ea\\u613f\\u653e\\u5f03\\u6e38\\u89c8\\uff0c\\u9152\\u5e97\\u4f4f\\u5bbf\\u3001\\u9910\\u3001\\u8f66\\u7b49\\u8d39\\u7528\\u5747\\u4e0d\\u9000\\u8fd8\\u3002\\n\\u8865\\u8d39\\u8bf4\\u660e\\n\\u5982\\u9047\\u822a\\u7a7a\\u516c\\u53f8\\u653f\\u7b56\\u6027\\u8c03\\u6574\\u673a\\u7968\\u4ef7\\u683c\\uff0c\\u8bf7\\u6309\\u89c4\\u5b9a\\u8865\\u4ea4\\u5dee\\u4ef7\\u3002\\u673a\\u7968\\u4ef7\\u683c\\u4e3a\\u56e2\\u961f\\u673a\\u7968\\uff0c\\u4e0d\\u5f97\\u6539\\u7b7e\\u6362\\u4eba\\u9000\\u7968\\uff1b\\n\\u5982\\u679c\\u65c5\\u6e38\\u76ee\\u7684\\u5730\\u56fd\\u5bb6\\u653f\\u7b56\\u6027\\u8c03\\u6574\\u95e8\\u7968\\u6216\\u5176\\u4ed6\\u76f8\\u5173\\u4ef7\\u683c\\uff0c\\u8bf7\\u6309\\u89c4\\u5b9a\\u8865\\u4ea4\\u5dee\\u4ef7\\uff1b","tip":null,"shopping":"\\u73e0\\u5b9d\\u5c55\\u793a\\u4e2d\\u5fc3\\uff08\\u7ea690\\u5206\\u949f\\uff09\\n\\u76ae\\u9769\\u5c55\\u793a\\u4e2d\\u5fc3\\uff08\\u7ea660\\u5206\\u949f\\uff09\\n\\u539f\\u77f3\\u6cf0\\u4e1d\\u9986\\uff08\\u7ea660\\u5206\\u949f\\uff09\\n\\u71d5\\u7a9d\\u4e73\\u80f6\\u4e2d\\u5fc3\\uff08\\u7ea660\\u5206\\u949f\\uff09\\n\\u571f\\u7279\\u4ea7\\u4f11\\u606f\\u7ad9\\uff08\\u7ea660\\u5206\\u949f\\uff09\\n\\u6bd2\\u86c7\\u7814\\u7a76\\u4e2d\\u5fc3\\uff08\\u7ea660\\u5206\\u949f\\uff09","activityaddress":null,"featureeat":null,"remarks":"(\\u53c2\\u8003\\u9152\\u5e97)\\n\\u66fc\\u8c37\\u5f53\\u5730\\u4e94\\u661f\\u9152\\u5e97\\nROYAL SUITE\\uff08\\u66fc\\u8c37\\u7687\\u5bb6\\u5957\\u623f\\u9152\\u5e97\\uff09 \\nROYAL CITY\\uff08\\u57ce\\u5e02\\u7687\\u5bb6\\u9152\\u5e97\\uff09 \\nPearl Resort & Hotel\\uff08\\u660e\\u73e0\\u5ea6\\u5047\\u9152\\u5e97\\uff09 \\nMida Hotel Ngamwongwan Bangkok\\uff08\\u66fc\\u8c37\\u7eb3\\u52a0\\u9a6c\\u7fc1\\u4e07\\u7c73\\u8fbe\\u9152\\u5e97\\uff09 \\nRama Gardens Hotel Bangkok\\uff08\\u66fc\\u8c37\\u62c9\\u739b\\u82b1\\u56ed\\u9152\\u5e97\\uff09 \\nMida Airport Hotel Bangkok(\\u66fc\\u8c37\\u7f8e\\u8fbe\\u5eca\\u66fc\\u673a\\u573a\\u9152\\u5e97)   \\n\\u6216\\u540c\\u7ea7\\n\\n\\u82ad\\u63d0\\u96c5\\u5f53\\u5730\\u4e94\\u661f\\u9152\\u5e97\\nD@Sea Hotel Pattaya\\uff08\\u82ad\\u5824\\u96c5\\u6d77\\u6d0bD\\u9152\\u5e97\\uff09\\nPrima Villa Hotel Pattaya\\uff08\\u82ad\\u5824\\u96c5\\u666e\\u745e\\u739b\\u522b\\u5885\\u9152\\u5e97\\uff09\\nWoraburi The Ritz Resort & Spa Pattaya\\uff08\\u82ad\\u63d0\\u96c5\\u6c83\\u52d2\\u5e03\\u91cc\\u4e3d\\u5609\\u5ea6\\u5047\\u6751\\u53ca\\u6c34\\u7597\\u4e2d\\u5fc3\\uff09\\nVareena Palace Hotel\\uff08\\u74e6\\u96f7\\u7eb3\\u7687\\u5bab\\u9152\\u5e97\\uff09\\nLakkhana Poolside Resort Pattaya\\uff08\\u82ad\\u5824\\u96c5\\u62c9\\u5361\\u7eb3\\u6cf3\\u6c60\\u5ea6\\u5047\\u6751\\uff09\\nBalihai Bay Hotel Pattaya\\uff08\\u82ad\\u5824\\u96c5\\u5df4\\u91cc\\u6d77\\u6e7e\\u9152\\u5e97\\uff09\\n\\u6216\\u540c\\u7ea7\\n\\n\\u66fc\\u8c37\\u56fd\\u9645\\u4e94\\u661f\\u9152\\u5e97\\nThe Bazaar Hotel Bangkok (\\u66fc\\u8c37\\u96c6\\u5e02\\u9152\\u5e97)\\nMontien Riverside Hotel\\uff08\\u8499\\u5929\\u6cb3\\u7554\\u9152\\u5e97\\uff09 \\nThe Berkeley Hotel Pratunam(\\u6c34\\u95e8\\u4f2f\\u514b\\u5229\\u9152\\u5e97)\\nThe Grand Fourwings Convention Hotel Bangkok (\\u66fc\\u8c37\\u98de\\u8d8a\\u5927\\u9152\\u5e97) \\n Centara Grand at Central Plaza Ladprao Bangkok (\\u66fc\\u8c37\\u76db\\u6cf0\\u6f9c\\u62c9\\u666e\\u5d02\\u4e2d\\u592e\\u5e7f\\u573a\\u9152\\u5e97)\\nPullman Bangkok King Power(\\u66fc\\u8c37\\u94c2\\u5c14\\u66fc\\u7687\\u6743\\u9152\\u5e97) \\nMovenpick Hotel Bangkok (\\u745e\\u4eab\\u9152\\u5e97)\\nChatrium Hotel Riverside Bangkok(\\u66fc\\u8c37\\u5bdf\\u6bbf\\u6cb3\\u7554\\u8c6a\\u534e\\u9152\\u5e97) \\n\\u6216\\u540c\\u7ea7","createuserid":"10274","createtime":"2017-01-24 15:57:00","timestamp":"2017-01-24 16:15:08","islogicdelete":"1"}
     * data_service : {"id":"8446","linesid":"13510","guid":"ddc19cce-b357-4b1e-b751-3f3510670e1136834","linesguid":"ddc19cce-b357-4b1e-b751-3f3510670e11","service_attrid":"1","service_levelattrname":"\\u6807\\u51c6\\u7b49","service_eatattrname":"\\u81ea\\u5b9a\\u4e49","service_liveattrname":"\\u53cc\\u4eba\\u6807\\u51c6\\u95f4","service_gotrafficattrname":"\\u98de\\u673a","service_backtrafficattrname":"\\u98de\\u673a","service_sighttrafficattrname":null,"service_insuranceattrname":"30\\u4e07\\u5143\\u51fa\\u5883\\u65c5\\u6e38\\u610f\\u5916\\u4f24\\u5bb3\\u9669(40\\u5143 \\/\\u4eba)","service_sightattrname":"\\u542b\\u884c\\u7a0b\\u5185\\u975e\\u81ea\\u8d39\\u666f\\u70b9\\u7b2c\\u4e00\\u5927\\u95e8\\u7968","service_guideattrname":"\\u5168\\u7a0b\\u5bfc\\u6e38\\u670d\\u52a1","islogicdelete":"1","createtime":"2017-01-24 15:57:00","createuserid":"10274","timestamp":"0000-00-00 00:00:00"}
     * data_show : [{"id":"31401","typeid":"2","title":"\\u5927\\u7687\\u5bab\\uff0c\\u7389\\u4f5b\\u5bfa\\uff0c\\u6e44\\u5357\\u6cb3\\u6c34\\u4e0a\\u5e02\\u573a\\uff0c\\u963f\\u5357\\u8fbe","content":"","pic_data":[{"link_title":"\\u6d77\\u6ee8\\u52b1\\u5fd7\\u590f\\u7acb\\u8425","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u6d77\\u6ee8\\u52b1\\u5fd7\\u590f\\u7acb\\u8425","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16769\\/45afd3b879d013d1ddd4a9baa88a9702.png","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16769\\/45afd3b879d013d1ddd4a9baa88a9702.png"},{"link_title":"\\u79e6\\u7687\\u6c42\\u4ed9\\u5165\\u6d77\\u5904","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u79e6\\u7687\\u6c42\\u4ed9\\u5165\\u6d77\\u5904","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16306\\/e56f4470b16a711823c24c8151ac7fca.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16306\\/e56f4470b16a711823c24c8151ac7fca.jpg"}]},{"id":"31402","typeid":"3","title":"\\u9a91\\u5927\\u8c61\\uff0c\\u9cc4\\u9c7c\\u8868\\u6f14\\uff0c\\u4e03\\u73cd\\u4f5b\\u5c71\\uff0c\\u4e5d\\u4e16\\u7687\\u5e99\\uff0c\\u8721\\u50cf\\u9986","content":"","pic_data":[{"link_title":"\\u675c\\u62c9\\u62c9\\u6c34\\u4e0a\\u56db\\u5b63\\u6751","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u675c\\u62c9\\u62c9\\u6c34\\u4e0a\\u56db\\u5b63\\u6751","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/15802\\/8c2722ea215b1c6c4e4aba0e62e0696c.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/15802\\/8c2722ea215b1c6c4e4aba0e62e0696c.jpg"}]},{"id":"31403","typeid":"4","title":"\\u91d1\\u6c99\\u5c9b\\uff0c\\u4e1c\\u65b9\\/\\u66b9\\u7f57\\u516c\\u4e3b\\u53f7\\uff0c\\u5609\\u5e74\\u534e\\u98ce\\u6708\\u8857\\uff0c\\u6cf0\\u5f0f\\u53e4\\u6cd5\\u6307\\u538b\\u6309\\u6469","content":"","pic_data":[]},{"id":"31404","typeid":"5","title":"\\u795e\\u6bbf\\u5bfa\\uff0cKING POWER\\u56fd\\u9645\\u514d\\u7a0e\\u4e2d\\u5fc3","content":"","pic_data":[{"link_title":"\\u5357\\u901a\\u6d0b\\u53e3\\u6e2f\\u6d77\\u4e0a\\u8fea\\u65af\\u79d1\\u4f11\\u95f2\\u65c5\\u6e38\\u533a","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u5357\\u901a\\u6d0b\\u53e3\\u6e2f\\u6d77\\u4e0a\\u8fea\\u65af\\u79d1\\u4f11\\u95f2\\u65c5\\u6e38\\u533a","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/13603\\/578b75c549e44ead23ccf01dccb6b9cb.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/13603\\/578b75c549e44ead23ccf01dccb6b9cb.jpg"}]},{"id":"31399","typeid":"102","title":"\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38","content":"\\u2605\\u4f4f\\u5bbf\\u5347\\u7ea7<br \\/>\\u5168\\u7a0b\\u6cf0\\u5f0f\\u4e94\\u661f\\u9152\\u5e97\\uff0c\\u66fc\\u8c37\\u5347\\u7ea71\\u665a\\u56fd\\u9645\\u4e94\\u661f\\u9152\\u5e97\\uff01<br \\/>\\u2605\\u884c\\u7a0b\\u5347\\u7ea7<br \\/>\\u5168\\u7a0b\\u76f4\\u98de\\u822a\\u73ed\\uff0c\\u8212\\u9002\\u5b89\\u5168\\u3002<br \\/>\\u8d85\\u503c\\u8d60\\u9001\\u4ef7\\u503c1288\\u5143\\u666f\\u70b9\\u884c\\u7a0b<br \\/>1.\\u62c9\\u739b\\u7687\\u671d\\u5927\\u7687\\u5bab+\\u7389\\u4f5b\\u5bfa\\uff08\\u6cf0\\u56fd\\u5730\\u6807\\u5f0f\\u5efa\\u7b51 \\u91d1\\u78a7\\u8f89\\u714c\\uff09<br \\/>2.\\u963f\\u5357\\u8fbe\\u6c99\\u739b\\u7a7a\\u7687\\u5bb6\\u5fa1\\u4f1a\\u9986 <br \\/>3.\\u7545\\u6e38\\u6e44\\u5357\\u6cb3+\\u6c34\\u4e0a\\u98ce\\u60c5(\\u4f53\\u9a8c\\u6cf0\\u56fd\\u6c34\\u4e0a\\u4eba\\u5bb6\\u7684\\u98ce\\u571f\\u4eba\\u60c5)<br \\/>4.\\u5609\\u5e74\\u534e\\u98ce\\u6708\\u6b65\\u884c\\u8857\\uff08\\u770b\\u5c3d\\u82ad\\u5824\\u96c5\\u591c\\u5e55\\u4e0b\\u7684\\u94c5\\u534e\\uff09<br \\/>5.\\u6b63\\u5b97\\u6cf0\\u5f0f\\u53e4\\u6307\\u538b\\u6cd5\\u6309\\u6469\\uff08\\u8212\\u7f13\\u65c5\\u9014\\u75b2\\u52b3\\uff0c\\u6b63\\u70b9\\uff09<br \\/>6.\\u9a91\\u5927\\u8c61&\\u9cc4\\u9c7c\\u8868\\u6f14<br \\/>7.\\u82ad\\u5824\\u96c5\\u4e09\\u5927\\u5947\\u89c2\\uff08\\u5927\\u5343\\u4e16\\u754c\\u65e0\\u5947\\u4e0d\\u6709\\uff09<br \\/>8.\\u6cf0\\u56fd\\u56fd\\u7cb9-\\u4e1c\\u65b9\\/\\u66b9\\u7f57\\u516c\\u4e3b\\u53f7\\uff08\\u4e0e\\u4eba\\u5996\\u72c2\\u6b22\\u5171\\u821e\\uff09<br \\/>9.\\u91d1\\u6c99\\u5c9b<br \\/>\\u2605\\u670d\\u52a1\\u5347\\u7ea7<br \\/>\\u5168\\u7a0b\\u65e0\\u81ea\\u8d39\\u518d\\u8d60\\u9001\\u6bcf\\u4eba1000\\u5143\\u81ea\\u8d39\\u5238\\uff08\\u5982\\u4e0d\\u53c2\\u52a0\\uff0c\\u89c6\\u4e3a\\u81ea\\u52a8\\u653e\\u5f03\\uff0c\\u4e0d\\u9000\\u4e0d\\u6362\\uff09<br \\/>\\u82ad\\u63d0\\u96c5\\u592a\\u5e73\\u6d0b\\u597d\\u671b\\u89d2<br \\/>\\u4eba\\u5996\\u8868\\u6f14<br \\/>\\u70ed\\u5e26\\u6c34\\u679c\\u56ed<br \\/>\\u68a6\\u5e7b\\u9b54\\u672f\\u5947\\u89c2\\u79c0<br \\/>\\u5e1d\\u738b\\u9910\\u2014\\u9c7c\\u7fc5\\u71d5\\u7a9d<br \\/>3D\\u795e\\u5947\\u7535\\u5f71\\u738b\\u56fd\\u6216\\u82ad\\u5824\\u96c5\\u591c\\u95f4\\u8868\\u6f14","pic_data":[{"link_title":"\\u6d4e\\u5dde\\u7279\\u8272\\u6854\\u5b50\\u5de7\\u514b\\u529b\\u56ed","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u6d4e\\u5dde\\u7279\\u8272\\u6854\\u5b50\\u5de7\\u514b\\u529b\\u56ed","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/3233\\/1db1fe34b47339dd92a669519d3afe89.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/3233\\/1db1fe34b47339dd92a669519d3afe89.jpg"},{"link_title":"\\u56db\\u5b63\\u5468\\u5e84\\uff08\\u6c5f\\u5357\\u6c34\\u4e61\\u7279\\u8272\\u6587\\u5316\\u6f14\\u51fa\\uff09","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u56db\\u5b63\\u5468\\u5e84\\uff08\\u6c5f\\u5357\\u6c34\\u4e61\\u7279\\u8272\\u6587\\u5316\\u6f14\\u51fa\\uff09","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/116\\/11\\/25097\\/1393cdd28dae3c691ee15f364da1d391.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/116\\/11\\/25097\\/1393cdd28dae3c691ee15f364da1d391.jpg"}]},{"id":"31400","typeid":"103","title":"\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38","content":"D1\\u5e38\\u5dde>\\u66fc\\u8c37>D2\\u5927\\u7687\\u5bab>\\u7389\\u4f5b\\u5bfa>\\u6e44\\u5357\\u6cb3\\u6c34\\u4e0a\\u5e02\\u573a>\\u963f\\u5357\\u8fbe>D3\\u66fc\\u8c37>\\u82ad\\u63d0\\u96c5>D4\\u91d1\\u6c99\\u5c9b>\\u4e1c\\u65b9\\/\\u66b9\\u7f57\\u516c\\u4e3b\\u53f7>\\u5609\\u5e74\\u534e\\u98ce\\u6708\\u8857>D5\\u82ad\\u63d0\\u96c5>\\u66fc\\u8c37>D6\\u66fc\\u8c37>\\u5e38\\u5dde","pic_data":[{"link_title":"\\u4e0a\\u6d77\\u91ce\\u751f\\u52a8\\u7269\\u56ed","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u4e0a\\u6d77\\u91ce\\u751f\\u52a8\\u7269\\u56ed","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/5013\\/e71d1c665735c624cc30c01c1847b7c0.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/5013\\/e71d1c665735c624cc30c01c1847b7c0.jpg"},{"link_title":"\\u9102\\u5c14\\u591a\\u65af\\u91ce\\u751f\\u52a8\\u7269\\u56ed","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u9102\\u5c14\\u591a\\u65af\\u91ce\\u751f\\u52a8\\u7269\\u56ed","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/67\\/11\\/180701\\/6a25388970af9b08c994b30ac7bd6a12.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/67\\/11\\/180701\\/6a25388970af9b08c994b30ac7bd6a12.jpg"}]},{"id":"31405","typeid":"104","title":"\\u6cf0\\u56fd\\u66fc\\u8c37\\u82ad\\u63d0\\u96c5\\u4e94\\u665a\\u516d\\u65e5\\u6e38","content":"","pic_data":[{"link_title":"\\u5b9d\\u6e90\\u8001\\u918b\\u574a","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u5b9d\\u6e90\\u8001\\u918b\\u574a","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg"},{"link_title":"\\u53ef\\u4f26\\u5bbe\\u91ce\\u751f\\u52a8\\u7269\\u56ed","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u53ef\\u4f26\\u5bbe\\u91ce\\u751f\\u52a8\\u7269\\u56ed","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/13512\\/cac07b6795c5205ccd0ec66c16e0e047.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/13512\\/cac07b6795c5205ccd0ec66c16e0e047.jpg"},{"link_title":"\\u6089\\u5c3c\\u91ce\\u751f\\u52a8\\u7269\\u56ed","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u6089\\u5c3c\\u91ce\\u751f\\u52a8\\u7269\\u56ed","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/13506\\/4feaac8536cf32a8b404819b5f769672.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/13506\\/4feaac8536cf32a8b404819b5f769672.jpg"}]}]
     * data_img : [{"link_title":"\\u5b9d\\u6e90\\u8001\\u918b\\u574a","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u5b9d\\u6e90\\u8001\\u918b\\u574a","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/7472\\/8951732c65ddfdfd639443f6d621cdc5.jpg"},{"link_title":"\\u53ef\\u4f26\\u5bbe\\u91ce\\u751f\\u52a8\\u7269\\u56ed","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u53ef\\u4f26\\u5bbe\\u91ce\\u751f\\u52a8\\u7269\\u56ed","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/13512\\/cac07b6795c5205ccd0ec66c16e0e047.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/13512\\/cac07b6795c5205ccd0ec66c16e0e047.jpg"},{"link_title":"\\u6089\\u5c3c\\u91ce\\u751f\\u52a8\\u7269\\u56ed","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u6089\\u5c3c\\u91ce\\u751f\\u52a8\\u7269\\u56ed","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/13506\\/4feaac8536cf32a8b404819b5f769672.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/13506\\/4feaac8536cf32a8b404819b5f769672.jpg"},{"link_title":"\\u6d77\\u6ee8\\u52b1\\u5fd7\\u590f\\u7acb\\u8425","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u6d77\\u6ee8\\u52b1\\u5fd7\\u590f\\u7acb\\u8425","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16769\\/45afd3b879d013d1ddd4a9baa88a9702.png","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16769\\/45afd3b879d013d1ddd4a9baa88a9702.png"},{"link_title":"\\u79e6\\u7687\\u6c42\\u4ed9\\u5165\\u6d77\\u5904","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u79e6\\u7687\\u6c42\\u4ed9\\u5165\\u6d77\\u5904","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16306\\/e56f4470b16a711823c24c8151ac7fca.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16306\\/e56f4470b16a711823c24c8151ac7fca.jpg"}]
     */

    private int res;
    private String msg;
    private DataBaseBean data_base;
    private DataContractBean data_contract;
    private DataRelatedBean data_related;
    private DataServiceBean data_service;
    private List<?> data_team;
    private List<DataJourneyBean> data_journey;
    private List<DataShowBean> data_show;
    private List<DataImgBean> data_img;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBaseBean getData_base() {
        return data_base;
    }

    public void setData_base(DataBaseBean data_base) {
        this.data_base = data_base;
    }

    public DataContractBean getData_contract() {
        return data_contract;
    }

    public void setData_contract(DataContractBean data_contract) {
        this.data_contract = data_contract;
    }

    public DataRelatedBean getData_related() {
        return data_related;
    }

    public void setData_related(DataRelatedBean data_related) {
        this.data_related = data_related;
    }

    public DataServiceBean getData_service() {
        return data_service;
    }

    public void setData_service(DataServiceBean data_service) {
        this.data_service = data_service;
    }

    public List<?> getData_team() {
        return data_team;
    }

    public void setData_team(List<?> data_team) {
        this.data_team = data_team;
    }

    public List<DataJourneyBean> getData_journey() {
        return data_journey;
    }

    public void setData_journey(List<DataJourneyBean> data_journey) {
        this.data_journey = data_journey;
    }

    public List<DataShowBean> getData_show() {
        return data_show;
    }

    public void setData_show(List<DataShowBean> data_show) {
        this.data_show = data_show;
    }

    public List<DataImgBean> getData_img() {
        return data_img;
    }

    public void setData_img(List<DataImgBean> data_img) {
        this.data_img = data_img;
    }

    public static class DataBaseBean {
        /**
         * id : 13510
         * guid : ddc19cce-b357-4b1e-b751-3f3510670e11
         * lines_name : \u3010\u6e05\u65b0\u6cf0\u56fd\u3011\u6cf0\u56fd\u66fc\u8c37\u82ad\u63d0\u96c5\u4e94\u665a\u516d\u65e5\u6e38 \uff08\u5e38\u5dde\u5f80\u8fd4\uff0c\u81ea\u7ec4\u56e2\uff09
         * lines_title : \u81ea\u7ec4\u56e2\uff0c\u8d60\u9001\u63a5\u9001\uff0c\u4e0d\u542b\u7b7e\u8bc1
         * lines_num : CL201701241015
         * lines_supname : null
         * lines_filetext : null
         * respon_id : 10274
         * respon_unitmaxid : 1313
         * supplier_id : 1
         * supplier_name : \u5e38\u5dde\u6625\u79cb\u56fd\u9645\u65c5\u884c\u793e\u6709\u9650\u516c\u53f8
         * lines_days : 6
         * lines_daysnight : 5
         * parent_lineid : 80ba1902-afd3-495e-83ea-b6f5312cd067
         * companyid : 1
         * company_name : \u5e38\u5dde\u6625\u79cb\u56fd\u9645\u65c5\u884c\u793e\u6709\u9650\u516c\u53f8
         * lines_validitybegin : null
         * lines_validityend : null
         * lines_modetype : 1
         * lines_from : 2
         * original_price : 0.00
         * scenic_spots_alongtheway : null
         * isshow : 10
         * islogicdelete : 1
         * createuserid : 10274
         * createtime : 2017-01-24 15:57:00
         * travelmode : 0
         * ranges : 3
         * treepath : 1334
         * voucherstate : 0
         * lines_leaveaddress : 115
         * timestamp : 2017-02-15 08:50:22
         * iscustomized : 0
         * is_sync_scenic : 1
         * saleprice : 0.01
         * lines_leavecityid : 115
         * lines_leavecityname : \u5e38\u5dde
         * lines_backcityid : 6058
         * lines_backcityname : null
         * can_sale_115 : 1
         * can_sale_113 : 1
         * can_sale : 1
         */

        private String id;
        private String guid;
        private String lines_name;
        private String lines_title;
        private String lines_num;
        private Object lines_supname;
        private Object lines_filetext;
        private String respon_id;
        private String respon_unitmaxid;
        private String supplier_id;
        private String supplier_name;
        private String lines_days;
        private String lines_daysnight;
        private String parent_lineid;
        private String companyid;
        private String company_name;
        private Object lines_validitybegin;
        private Object lines_validityend;
        private String lines_modetype;
        private String lines_from;
        private String original_price;
        private Object scenic_spots_alongtheway;
        private String isshow;
        private String islogicdelete;
        private String createuserid;
        private String createtime;
        private String travelmode;
        private String ranges;
        private String treepath;
        private String voucherstate;
        private String lines_leaveaddress;
        private String timestamp;
        private String iscustomized;
        private String is_sync_scenic;
        private String saleprice;
        private String lines_leavecityid;
        private String lines_leavecityname;
        private String lines_backcityid;
        private Object lines_backcityname;
        private int can_sale_115;
        private int can_sale_113;
        private int can_sale;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public String getLines_name() {
            return lines_name;
        }

        public void setLines_name(String lines_name) {
            this.lines_name = lines_name;
        }

        public String getLines_title() {
            return lines_title;
        }

        public void setLines_title(String lines_title) {
            this.lines_title = lines_title;
        }

        public String getLines_num() {
            return lines_num;
        }

        public void setLines_num(String lines_num) {
            this.lines_num = lines_num;
        }

        public Object getLines_supname() {
            return lines_supname;
        }

        public void setLines_supname(Object lines_supname) {
            this.lines_supname = lines_supname;
        }

        public Object getLines_filetext() {
            return lines_filetext;
        }

        public void setLines_filetext(Object lines_filetext) {
            this.lines_filetext = lines_filetext;
        }

        public String getRespon_id() {
            return respon_id;
        }

        public void setRespon_id(String respon_id) {
            this.respon_id = respon_id;
        }

        public String getRespon_unitmaxid() {
            return respon_unitmaxid;
        }

        public void setRespon_unitmaxid(String respon_unitmaxid) {
            this.respon_unitmaxid = respon_unitmaxid;
        }

        public String getSupplier_id() {
            return supplier_id;
        }

        public void setSupplier_id(String supplier_id) {
            this.supplier_id = supplier_id;
        }

        public String getSupplier_name() {
            return supplier_name;
        }

        public void setSupplier_name(String supplier_name) {
            this.supplier_name = supplier_name;
        }

        public String getLines_days() {
            return lines_days;
        }

        public void setLines_days(String lines_days) {
            this.lines_days = lines_days;
        }

        public String getLines_daysnight() {
            return lines_daysnight;
        }

        public void setLines_daysnight(String lines_daysnight) {
            this.lines_daysnight = lines_daysnight;
        }

        public String getParent_lineid() {
            return parent_lineid;
        }

        public void setParent_lineid(String parent_lineid) {
            this.parent_lineid = parent_lineid;
        }

        public String getCompanyid() {
            return companyid;
        }

        public void setCompanyid(String companyid) {
            this.companyid = companyid;
        }

        public String getCompany_name() {
            return company_name;
        }

        public void setCompany_name(String company_name) {
            this.company_name = company_name;
        }

        public Object getLines_validitybegin() {
            return lines_validitybegin;
        }

        public void setLines_validitybegin(Object lines_validitybegin) {
            this.lines_validitybegin = lines_validitybegin;
        }

        public Object getLines_validityend() {
            return lines_validityend;
        }

        public void setLines_validityend(Object lines_validityend) {
            this.lines_validityend = lines_validityend;
        }

        public String getLines_modetype() {
            return lines_modetype;
        }

        public void setLines_modetype(String lines_modetype) {
            this.lines_modetype = lines_modetype;
        }

        public String getLines_from() {
            return lines_from;
        }

        public void setLines_from(String lines_from) {
            this.lines_from = lines_from;
        }

        public String getOriginal_price() {
            return original_price;
        }

        public void setOriginal_price(String original_price) {
            this.original_price = original_price;
        }

        public Object getScenic_spots_alongtheway() {
            return scenic_spots_alongtheway;
        }

        public void setScenic_spots_alongtheway(Object scenic_spots_alongtheway) {
            this.scenic_spots_alongtheway = scenic_spots_alongtheway;
        }

        public String getIsshow() {
            return isshow;
        }

        public void setIsshow(String isshow) {
            this.isshow = isshow;
        }

        public String getIslogicdelete() {
            return islogicdelete;
        }

        public void setIslogicdelete(String islogicdelete) {
            this.islogicdelete = islogicdelete;
        }

        public String getCreateuserid() {
            return createuserid;
        }

        public void setCreateuserid(String createuserid) {
            this.createuserid = createuserid;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getTravelmode() {
            return travelmode;
        }

        public void setTravelmode(String travelmode) {
            this.travelmode = travelmode;
        }

        public String getRanges() {
            return ranges;
        }

        public void setRanges(String ranges) {
            this.ranges = ranges;
        }

        public String getTreepath() {
            return treepath;
        }

        public void setTreepath(String treepath) {
            this.treepath = treepath;
        }

        public String getVoucherstate() {
            return voucherstate;
        }

        public void setVoucherstate(String voucherstate) {
            this.voucherstate = voucherstate;
        }

        public String getLines_leaveaddress() {
            return lines_leaveaddress;
        }

        public void setLines_leaveaddress(String lines_leaveaddress) {
            this.lines_leaveaddress = lines_leaveaddress;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getIscustomized() {
            return iscustomized;
        }

        public void setIscustomized(String iscustomized) {
            this.iscustomized = iscustomized;
        }

        public String getIs_sync_scenic() {
            return is_sync_scenic;
        }

        public void setIs_sync_scenic(String is_sync_scenic) {
            this.is_sync_scenic = is_sync_scenic;
        }

        public String getSaleprice() {
            return saleprice;
        }

        public void setSaleprice(String saleprice) {
            this.saleprice = saleprice;
        }

        public String getLines_leavecityid() {
            return lines_leavecityid;
        }

        public void setLines_leavecityid(String lines_leavecityid) {
            this.lines_leavecityid = lines_leavecityid;
        }

        public String getLines_leavecityname() {
            return lines_leavecityname;
        }

        public void setLines_leavecityname(String lines_leavecityname) {
            this.lines_leavecityname = lines_leavecityname;
        }

        public String getLines_backcityid() {
            return lines_backcityid;
        }

        public void setLines_backcityid(String lines_backcityid) {
            this.lines_backcityid = lines_backcityid;
        }

        public Object getLines_backcityname() {
            return lines_backcityname;
        }

        public void setLines_backcityname(Object lines_backcityname) {
            this.lines_backcityname = lines_backcityname;
        }

        public int getCan_sale_115() {
            return can_sale_115;
        }

        public void setCan_sale_115(int can_sale_115) {
            this.can_sale_115 = can_sale_115;
        }

        public int getCan_sale_113() {
            return can_sale_113;
        }

        public void setCan_sale_113(int can_sale_113) {
            this.can_sale_113 = can_sale_113;
        }

        public int getCan_sale() {
            return can_sale;
        }

        public void setCan_sale(int can_sale) {
            this.can_sale = can_sale;
        }
    }

    public static class DataContractBean {
        /**
         * id : 6720
         * linesid : 13510
         * guid : ddc19cce-b357-4b1e-b751-3f3510670e11
         * linesguid : ddc19cce-b357-4b1e-b751-3f3510670e11
         * areascodesnames : \u51fa\u53d1\u5730:\u5e38\u5dde\u5e02\n\u76ee\u7684\u5730:\u6cf0\u56fd
         * linesname : \u3010\u6e05\u65b0\u6cf0\u56fd\u3011\u6cf0\u56fd\u66fc\u8c37\u82ad\u63d0\u96c5\u4e94\u665a\u516d\u65e5\u6e38 \uff08\u5e38\u5dde\u5f80\u8fd4\uff0c\u81ea\u7ec4\u56e2\uff09
         * journeysight : \u5927\u7687\u5bab\uff0c\u7389\u4f5b\u5bfa\uff0c\u6e44\u5357\u6cb3\u6c34\u4e0a\u5e02\u573a\uff0c\u963f\u5357\u8fbe,\u9a91\u5927\u8c61\uff0c\u9cc4\u9c7c\u8868\u6f14\uff0c\u4e03\u73cd\u4f5b\u5c71\uff0c\u4e5d\u4e16\u7687\u5e99\uff0c\u8721\u50cf\u9986,\u91d1\u6c99\u5c9b\uff0c\u4e1c\u65b9\/\u66b9\u7f57\u516c\u4e3b\u53f7\uff0c\u5609\u5e74\u534e\u98ce\u6708\u8857\uff0c\u6cf0\u5f0f\u53e4\u6cd5\u6307\u538b\u6309\u6469,\u795e\u6bbf\u5bfa\uff0cKING POWER\u56fd\u9645\u514d\u7a0e\u4e2d\u5fc3,
         * servicegotrafficattrname : \u53bb\u7a0b\uff1a\u98de\u673a\n\u8fd4\u7a0b\uff1a\u98de\u673a
         * gotostand : \u8bf7\u6e38\u5ba2\u81ea\u884c\u524d\u5f80
         * serviceeatattrname : 5\u65e98\u6b63
         * servicelevelattrname : \u53cc\u4eba\u6807\u51c6\u95f4
         * journeyshopping : null
         * journeyactivity : null
         * journeysightself : null
         * serviceguideattrname : \u5168\u7a0b\u5bfc\u6e38\u670d\u52a1
         * payname : \u73b0\u4ed8
         * paydate : \u672c\u5408\u540c\u7b7e\u8ba2\u4e4b\u65e5\u4e00\u6b21\u6027\u4ed8\u6e05
         * teamtype : \u672c\u793e\u81ea\u884c\u7ec4\u56e2
         * supplement : \u6b64\u6b21\u65c5\u6e38\u56e2\u961f\u6d89\u53ca\u9646\u8fd0\u3001\u6c34\u8fd0\u5176\u4e2d\u7684\u7968\u52a1\u548c\u8f66\u4f4d\u635f\u5931\u95ee\u9898\u3002\u4e00\u7ecf\u7b7e\u5b57\u786e\u8ba4\u540e\uff0c\u5982\u987b\u9000\u56e2\u6e38\u5ba2\u5219\u5c06\u5e94\u5411\u65c5\u884c\u793e\u8865\u507f\u76f8\u5e94\u7684\u635f\u5931\u3002\u6b64\u635f\u5931\u8d39\u7528\u53c2\u8003\u5b9e\u9645\u62a5\u540d\u56e2\u961f\u800c\u5b9a\u3002\u51fa\u56e2\u524d24\u5c0f\u65f6\u9000\u56e2\u6216\u8fdf\u523015\u5206\u949f\uff0c\u89c6\u4e3a\u81ea\u52a8\u653e\u5f03\uff0c\u4e0d\u9000\u4efb\u4f55\u8d39\u7528\u3002\r\n1.\u6211\u793e\u4fdd\u8bc1\u4ee5\u4e0a\u666f\u70b9\u5168\u90e8\u6e38\u89c8,\u6e38\u89c8\u987a\u5e8f\u6309\u5f53\u5929\u5b9e\u9645\u60c5\u51b5\u4e3a\u51c6.\u5bfc\u6e38\u53ef\u8c03\u6574\u6e38\u89c8\u987a\u5e8f.\r\n2.\u4ef7\u683c\u4ee5\u62a5\u540d\u65f6\u6536\u8d39\u4e3a\u51c6\uff0c\u5c0f\u5b69\u6536\u8d39\u4e3a\u4e0d\u542b\u666f\u70b9\u95e8\u7968\uff0c\u82e5\u4e8c\u65e5\u6e38\u4ee5\u4e0a\u4e0d\u542b\u95e8\u7968\u548c\u5e8a\u4f4d\u3002\u5982\u5728\u6e38\u89c8\u666f\u70b9\u65f6\u8d85\u9ad8\uff0c\u9700\u81ea\u884c\u8865\u4ea4\u8d85\u9ad8\u90e8\u5206\u95e8\u7968\uff1b\u4e00\u822c\u666f\u533a\u513f\u7ae5\u8eab\u9ad81.1\u7c73\u4ee5\u4e0b\u514d\u7968\u3002\r\n3.\u8bf7\u6e38\u5ba2\u51c6\u65f6\u5230\u8fbe\u96c6\u5408\u70b9\u4e0a\u8f66(\u8fc7\u65f6\u4e0d\u5019,\u656c\u8bf7\u4f53\u8c05),\u4ee5\u4fbf\u6211\u793e\u5bfc\u6e38\u5de5\u4f5c\u987a\u5229\u5f00\u5c55,\u8c22\u8c22\u652f\u6301\u3002\r\n4.\u5728\u65c5\u9014\u4e2d\u5982\u9047\u81ea\u7406\u666f\u70b9,\u6e38\u5ba2\u53ef\u81ea\u613f\u53c2\u52a0(\u5168\u8f66\u6e38\u5ba2\u6309\u5c11\u6570\u670d\u4ece\u591a\u6570\u539f\u5219),\u672a\u53c2\u52a0\u8005\u8bf7\u5728\u666f\u70b9\u95e8\u53e3\u7b49\u5019,\u8c22\u8c22\u914d\u5408!\r\n5. \u6211\u793e\u5c06\u4f1a\u6309\u7167\u6b64\u56e2\u62a5\u540d\u5148\u540e\u987a\u5e8f\u7531\u603b\u90e8\u7edf\u4e00\u5b89\u6392\u5ea7\u4f4d(\u5982\u8f66\u4e0a\u6709\u8001\u5f31\u5b7a\u9700\u8981\u7167\u987e,\u8bf7\u5404\u4f4d\u56e2\u53cb\u81ea\u89c9\u793c\u8ba9,\u542c\u4ece\u5bfc\u6e38\u5b89\u6392,\u8c22\u8c22)\u3002\r\n6.\u6e38\u5ba2\u81ea\u613f\u653e\u5f03\u666f\u70b9\u6e38\u89c8\u7684,\u95e8\u7968\u8d39\u7528\u4e00\u6982\u4e0d\u9000.\r\n7.\u5982\u9047\u56fd\u5bb6\u6027\u653f\u7b56\u8c03\u4ef7\u548c\u4eba\u529b\u4e0d\u53ef\u6297\u62d2\u56e0\u7d20\u9020\u6210\u7684\u635f\u5931\u548c\u8d39\u7528\u589e\u52a0\u7b49\u6e38\u5ba2\u81ea\u7406\u3002\r\n8.\u5982\u53c2\u52a0\u5177\u6709\u5371\u9669\u6027\u6d3b\u52a8\u9879\u76ee\u7684\u9700\u5f81\u5f97\u6211\u793e\u7684\u540c\u610f,\u5982\u81ea\u884c\u53c2\u52a0\u4ea7\u751f\u635f\u5931,\u6211\u793e\u6982\u4e0d\u8d1f\u8d23\u3002\r\n9.\u6e38\u5ba2\u5e94\u5982\u5b9e\u8bf4\u660e\u8eab\u4f53\u72b6\u51b5\uff0c\u4e0d\u5f97\u9690\u7792\u81ea\u8eab\u75be\u75c5\u3002\u82e5\u9690\u7792\u75c5\u60c5\uff0c\u7531\u81ea\u8eab\u539f\u56e0\u9020\u6210\u4f24\u5bb3\u7684\uff0c\u65c5\u884c\u793e\u4e0d\u627f\u62c5\u3002\r\n10.\u51e1\u53c2\u52a0\u6211\u793e\u7ec4\u7ec7\u65c5\u6e38\u7684\u6240\u6709\u6e38\u5ba2\uff08\u5305\u62ec\u672a\u6d3e\u201c\u5168\u7a0b\u966a\u540c\u201d\u7684\u6563\u5ba2\u548c\u6709\u5168\u966a\u5bfc\u6e38\u7684\u56e2\u961f\u6e38\u5ba2\uff09\uff0c\u5982\u5728\u65c5\u6e38\u8fc7\u7a0b\u4e2d\u53d1\u73b0\u6709\u4e0e\u5408\u540c\u4e0d\u7b26\u4e4b\u5904\u6216\u6709\u5f02\u8bae\uff0c\u5e94\u5728\u77e5\u9053\u60c5\u51b5\u7684\u6700\u65e9\u65f6\u95f4\u901a\u77e5\u6211\u793e\uff0c\u4fbf\u4e8e\u6211\u793e\u53ca\u65f6\u4e86\u89e3\u548c\u89e3\u51b3\u95ee\u9898\uff0c\u907f\u514d\u7531\u4e8e\u672a\u53ca\u65f6\u901a\u77e5\uff0c\u6211\u793e\u4e0d\u77e5\u60c5\u800c\u5ef6\u8bef\u5904\u7406\uff0c\u4ee5\u6700\u5927\u9650\u5ea6\u4fdd\u969c\u6e38\u5ba2\u7684\u5408\u6cd5\u6743\u76ca\u3002\u8bf7\u5728\u5f53\u5730\u5982\u5b9e\u586b\u5199\u300a\u610f\u89c1\u53cd\u9988\u8868\u300b\uff0c\u56e2\u961f\u8d28\u91cf\u6211\u793e\u4ee5\u5404\u4f4d\u6e38\u5ba2\u5728\u5f53\u5730\u586b\u5199\u7684\u300a\u610f\u89c1\u53cd\u9988\u8868\u300b\u4e3a\u51c6\u3002\r\n11.\u65c5\u6e38\u8005\u5728\u672c\u5408\u540c\u5b89\u6392\u7684\u8d2d\u7269\u70b9\u6240\u8d2d\u7269\u54c1\u5982\u7cfb\u5047\u5192\u4f2a\u52a3\u5546\u54c1\u65f6,\u5fc5\u987b\u5728\u56de\u56e2\u540e7\u65e5\u5185\u5411\u65c5\u884c\u793e\u63d0\u51fa\uff01\r\n\u6cbf\u9014\u63a5\u9001\uff1a\u6bcf\u4e24\u5c0f\u65f6\u6eda\u52a8\u53d1\u8f66\uff0c\u5982\u56e0\u822a\u73ed\u5ef6\u8bef\u6ca1\u642d\u4e58\u5230\u8f66\u7684\uff0c\u81ea\u52a8\u5ef6\u5230\u4e0b\u4e00\u73ed\uff0c\u540c\u65f6\u9700\u7ecf\u8fc7\u51e0\u4e2a\u57ce\u5e02\u7684\u642d\u4e58\uff0c\u65f6\u95f4\u8f83\u957f\uff01\r\n12.\u4f4f\u5bbf\uff1a\u5168\u7a0b\u6307\u5b9a\u9152\u5e97\uff08\u63d0\u793a\uff1a\u7531\u4e8e\u5730\u533a\u6027\u5dee\u5f02\uff0c\u9152\u5e97\u7684\u8bc4\u5224\u6807\u51c6\u4e5f\u5b58\u5728\u5dee\u5f02\uff0c\u5ba2\u4eba\u4e0d\u80fd\u4ee5\u51fa\u53d1\u5730\u9152\u5e97\u7684\u6807\u51c6\u53bb\u8861\u91cf\uff0c\u656c\u8bf7\u8c05\u89e3\uff01\uff09\r\n13.\u672c\u56e2\u706b\u8f66\u7968\u7531\u672c\u65c5\u884c\u793e\u4ee3\u6536\u4ee3\u4ed8\uff0c\u706b\u8f66\u7968\u7968\u636e\u4ea4\u4ed8\u5ba2\u4eba\u3002
         * remarks : \u672a\u6ee116\u4eba\u4e0d\u6210\u56e2\u65e0\u6cd5\u5f00\u73ed,\u6e38\u5ba2\u53ef\u9009\u62e9\u987a\u5ef6\u65e5\u671f\u51fa\u884c\u6216\u5168\u989d\u9000\u6b3e!
         * notice : \u65c5\u6e38\u6d3b\u52a8\u672c\u8eab\u5e26\u6709\u4e00\u5b9a\u7684\u5371\u9669\u6027\uff0c\u4e14\u65c5\u9014\u4e2d\u4f1a\u6709\u4e00\u4e9b\u610f\u5916\u4e8b\u4ef6\u53d1\u751f\uff0c\u8bf7\u60a8\u52a1\u5fc5\u589e\u5f3a\u81ea\u6211\u4fdd\u62a4\u610f\u8bc6\u3002\u4e3a\u4e86\u4fdd\u8bc1\u60a8\u7684\u672c\u6b21\u65c5\u6e38\u6d3b\u52a8\u987a\u5229\u8fdb\u884c\uff0c\u8bf7\u4ed4\u7ec6\u9605\u8bfb\u4e0b\u5217\u6ce8\u610f\u4e8b\u9879\u3002\r\n\u203b \u51fa\u6e38\u524d\u51c6\u5907\r\n1\u3001\u51fa\u95e8\u524d\u8bf7\u5e26\u597d\u6709\u6548\u8bc1\u4ef6\uff08\u5982\u8eab\u4efd\u8bc1\u7b49\uff09\uff0c\u5e76\u544a\u77e5\u5bb6\u4eba\u51fa\u6e38\u8ba1\u5212\uff0c\u4fdd\u6301\u901a\u8baf\u7545\u901a\uff0c\u4ee5\u4fbf\u968f\u65f6\u8054\u7cfb\u3002\r\n2\u3001\u4e58\u5750\u4ea4\u901a\u5de5\u5177\uff0c\u8bf7\u770b\u6e05\u8f66\u7ad9\u3001\u7801\u5934\u3001\u673a\u573a\u540d\u79f0\u53ca\u51fa\u53d1\u65f6\u95f4\uff0c\u5e76\u518d\u4e00\u6b21\u786e\u8ba4\u662f\u5426\u5e26\u597d\u6709\u6548\u8bc1\u4ef6\uff0c\u513f\u7ae5\u8bf7\u5e26\u597d\u6237\u53e3\u7c3f\u6216\u51fa\u751f\u8bc1\u539f\u4ef6\u3002\u5efa\u8bae\u60a8\u63d0\u524d1\u5c0f\u65f6\u5230\u706b\u8f66\u7ad9\uff08\u7801\u5934\uff09\u3001\u63d0\u524d120\u5206\u949f\u5230\u673a\u573a\uff0c\u5e76\u529e\u59a5\u5b89\u68c0\u7b49\u76f8\u5173\u624b\u7eed\u3002\r\n3\u3001\u51fa\u6e38\u524d\u8bf7\u7559\u610f\u65c5\u6e38\u76ee\u7684\u5730\u5929\u6c14\u60c5\u51b5\uff0c\u9002\u5f53\u589e\u51cf\u8863\u670d\uff0c\u5e76\u5e26\u597d\u96e8\u4f1e\u3002\u8bf7\u9009\u62e9\u8f6f\u5e95\u8212\u9002\u7684\u978b\u5b50\uff0c\u767b\u5c71\u8bf7\u9009\u62e9\u9632\u6ed1\u65c5\u6e38\u978b\uff0c\u5973\u58eb\u4e0d\u7a7f\u88d9\u5b50\u3001\u9ad8\u8ddf\u978b\u3002\r\n4\u3001\u6574\u7406\u597d\u4e2a\u4eba\u65c5\u6e38\u7528\u54c1\u53ca\u5e38\u7528\u836f\u54c1\uff08\u5982\u6655\u8f66\u836f\u3001\u6b62\u6cfb\u836f\uff09\u3001\u6d77\u5c9b\u65c5\u6e38\u8bf7\u5e26\u597d\u9632\u6652\u971c\u3001\u592a\u9633\u955c\u3001\u6cf3\u8863\u3001\u62d6\u978b\u7b49\u3002\u51fa\u95e8\u65c5\u6e38\u8bf7\u52ff\u643a\u5e26\u8d35\u91cd\u7269\u54c1\u548c\u5927\u91cf\u73b0\u91d1\u3002\r\n\u203b \u65c5\u9014\u5b89\u5168\r\n1\u3001\u4e58\u5750\u6c7d\u8f66\u65c5\u6e38\uff0c\u5728\u8f66\u8f86\u884c\u9a76\u8fc7\u7a0b\u4e2d\u8bf7\u52ff\u5728\u8f66\u53a2\u5185\u64c5\u81ea\u7ad9\u7acb\u3001\u884c\u8d70\uff1b\u513f\u7ae5\u5fc5\u987b\u6709\u5ea7\u4f4d\uff1b\u8bf7\u7231\u62a4\u8f66\u8f86\u8bbe\u65bd\u8bbe\u5907\uff0c\u4e0d\u5728\u8f66\u53a2\u5185\u5438\u70df\uff0c\u4fdd\u6301\u8f66\u53a2\u5185\u73af\u5883\u6e05\u6d01\u3002\r\n2\u3001\u5728\u6574\u4e2a\u65c5\u6e38\u8fc7\u7a0b\u4e2d\u505a\u5230\u8d70\u8def\u4e0d\u89c2\u666f\uff0c\u89c2\u666f\u4e0d\u8d70\u8def\uff0c\u542c\u4ece\u5bfc\u6e38\u4eba\u5458\u7684\u6307\u6325\u5b89\u6392\uff0c\u4e0d\u5f97\u64c5\u81ea\u8fdb\u5165\u666f\u533a\u5185\u7684\u5371\u9669\u533a\u57df\u6216\u7981\u6b62\u6e38\u89c8\u533a\u57df\u3002\r\n3\u3001\u8f83\u8d35\u91cd\u7269\u54c1\uff08\u73b0\u91d1\u3001\u8bc1\u4ef6\u3001\u76f8\u673a\u7b49\uff09\u8bf7\u968f\u8eab\u643a\u5e26\uff0c\u8bf7\u52ff\u9057\u5fd8\u5728\u666f\u70b9\u3001\u9910\u684c\u3001\u8d2d\u7269\u5546\u5e97\u3001\u5c0f\u644a\u4e0a\u3002\r\n4\u3001\u6e38\u5ba2\u5728\u65c5\u6e38\u8fc7\u7a0b\u4e2d\u5e94\u5c0a\u91cd\u65c5\u6e38\u5730\u7684\u98ce\u571f\u4eba\u60c5\u548c\u6c11\u65cf\u4e60\u4fd7\uff0c\u7ef4\u62a4\u73af\u5883\u536b\u751f\uff0c\u9075\u5b88\u516c\u5171\u79e9\u5e8f\uff0c\u4fdd\u62a4\u751f\u6001\u73af\u5883\u548c\u6587\u7269\u53e4\u8ff9\uff0c\u5c0a\u91cd\u4ed6\u4eba\uff0c\u4ee5\u793c\u5f85\u4eba\u3002\r\n5\u3001\u6e38\u5ba2\u5e94\u9075\u5b88\u56e2\u961f\u7eaa\u5f8b\u3001\u914d\u5408\u9886\u961f\u3001\u5bfc\u6e38\u5de5\u4f5c\u3002\u56e0\u81ea\u8eab\u75be\u75c5\u7b49\u539f\u56e0\u4e0d\u80fd\u968f\u56e2\u524d\u884c\uff0c\u9700\u4e66\u9762\u7533\u8bf7\u5e76\u7ecf\u9886\u961f\u3001\u5bfc\u6e38\u7b7e\u5b57\u540c\u610f\uff0c\u5982\u672a\u7ecf\u4e66\u9762\u540c\u610f\u800c\u64c5\u81ea\u79bb\u56e2\uff0c\u6240\u9020\u6210\u7684\u4eba\u8eab\u548c\u8d22\u4ea7\u635f\u5931\uff0c\u65c5\u884c\u793e\u6982\u4e0d\u627f\u62c5\u8d23\u4efb\u3002\u65c5\u6e38\u884c\u7a0b\u5916\u51fa\u6e38\u8bf7\u7ed3\u4f34\u540c\u884c\u3002\r\n6\u3001\u6e38\u5ba2\u5e94\u9075\u7eaa\u5b88\u6cd5\uff0c\u9075\u5b88\u4ea4\u901a\u89c4\u5219\uff0c\u8b66\u60d5\u4e0a\u5f53\u53d7\u9a97\uff0c\u9632\u6b62\u88ab\u5077\u88ab\u62a2\uff0c\u4e0d\u53c2\u4e0e\u8d4c\u535a\uff0c\u5438\u6bd2\uff0c\u4e0d\u6d89\u8db3\u8272\u60c5\u573a\u6240\u3002\r\n7\u3001\u672a\u6210\u5e74\u4eba\u53c2\u52a0\u65c5\u6e38\u6d3b\u52a8\uff0c\u987b\u4e8b\u5148\u5f81\u5f97\u65c5\u884c\u793e\u540c\u610f\uff0c\u5e76\u7531\u6cd5\u5b9a\u76d1\u62a4\u4eba\u966a\u540c\u51fa\u6e38\u3002\u76d1\u62a4\u4eba\u8d1f\u8d23\u672a\u6210\u5e74\u4eba\u65c5\u6e38\u8fc7\u7a0b\u4e2d\u7684\u5b89\u5168\u95ee\u9898\u3002\r\n8\u3001\u4e2d\u8001\u5e74\u4eba\u5c24\u5176\u662f\u60a3\u75c5\u8005\u53c2\u52a0\u65c5\u6e38\uff0c\u987b\u5982\u5b9e\u5411\u65c5\u884c\u793e\u63d0\u4f9b\u5065\u5eb7\u4fe1\u606f\uff0c\u5e76\u6839\u636e\u81ea\u5df1\u7684\u5065\u5eb7\u72b6\u51b5\u91cf\u529b\u800c\u884c\u3002\u5982\u6e38\u5ba2\u611f\u89c9\u8eab\u4f53\u4e0d\u9002\uff0c\u8bf7\u9a6c\u4e0a\u544a\u77e5\u5bfc\u6e38\u3002\u56e0\u4e2d\u8001\u5e74\u65c5\u5ba2\u8eab\u4f53\u539f\u56e0\u4ea7\u751f\u7684\u4e00\u5207\u540e\u679c\u4e0e\u8d23\u4efb\uff0c\u65c5\u884c\u793e\u6982\u4e0d\u627f\u62c5\u3002\r\n\u203b \u98df\u5bbf\u987b\u77e5\r\n1\u3001\u5165\u4f4f\u5bbe\u9986\u623f\u95f4\u65f6\u8bf7\u5148\u67e5\u770b\u5ba2\u623f\u7269\u54c1\u6e05\u5355\uff0c\u5982\u53d1\u73b0\u7f3a\u5c11\uff0c\u53ca\u65f6\u4e0e\u5bfc\u6e38\u548c\u5ba2\u623f\u670d\u52a1\u5458\u8054\u7cfb\u3002\r\n2\u3001\u8bf7\u4ed4\u7ec6\u8fa8\u522b\u9152\u5e97\u3001\u5ba2\u623f\u5185\u7684\u7269\u54c1\u662f\u5426\u4e3a\u6709\u507f\u7269\u54c1\u3002\u9664\u5ba2\u623f\u5185\u4e00\u6b21\u6027\u7528\u54c1\u5916\uff0c\u9152\u5e97\u7269\u54c1\u8bf7\u52ff\u968f\u610f\u5e26\u8d70\u6216\u635f\u574f\u3002\r\n3\u3001\u4f7f\u7528\u5ba2\u623f\u5185\u6536\u8d39\u7269\u54c1\u6216\u6536\u8d39\u7535\u89c6\u7b49\uff0c\u8bf7\u770b\u6e05\u4ef7\u683c\u540e\u518d\u4f7f\u7528\u3002\r\n4\u3001\u5404\u5730\u5bbe\u9986\u8bbe\u65bd\u5747\u6709\u5dee\u5f02\uff0c\u5982\u6d74\u5ba4\u5185\u65e0\u9632\u6ed1\u57ab\uff0c\u6d17\u6fa1\u65f6\u8bf7\u7279\u522b\u6ce8\u610f\u5b89\u5168\uff0c\u9632\u6b62\u6ed1\u5012\uff0c\u8001\u4eba\u51ac\u5b63\u6d17\u6fa1\u65f6\u95f4\u4e0d\u5b9c\u8fc7\u957f\u3002\r\n5\u3001\u6e38\u5ba2\u54c1\u5c1d\u5f53\u5730\u7f8e\u98df\uff0c\u8bf7\u6839\u636e\u81ea\u8eab\u80a0\u80c3\u60c5\u51b5\u800c\u5b9a\uff0c\u6ce8\u610f\u996e\u98df\u996e\u6c34\u536b\u751f\uff0c\u5207\u52ff\u66b4\u996e\u66b4\u98df\u3002\r\n6\u3001\u65c5\u6e38\u80dc\u5730\u3001\u6d77\u8fb9\u6c99\u6ee9\u7b49\u5730\uff0c\u5c0f\u5546\u4e91\u96c6\uff0c\u8bf7\u52ff\u8ddf\u62c9\u5ba2\u8005\u53bb\u6392\u6321\u6216\u996d\u5e97\u7528\u9910\uff0c\u4ee5\u514d\u88ab\u5bb0\u3002\r\n7\u3001\u5728\u5ba4\u5185\u6e38\u6cf3\u6c60\u6e38\u6cf3\u65f6\u5207\u5fcc\u8df3\u6c34\uff0c\u6e38\u6cf3\u8fc7\u540e\u52ff\u98df\u6c34\u679c\u3002
         * warning : null
         * islogicdelete : 1
         * createuserid : 12139
         * createtime : 2017-02-10 08:49:14
         * timestamp : 2017-02-10 08:49:15
         */

        private String id;
        private String linesid;
        private String guid;
        private String linesguid;
        private String areascodesnames;
        private String linesname;
        private String journeysight;
        private String servicegotrafficattrname;
        private String gotostand;
        private String serviceeatattrname;
        private String servicelevelattrname;
        private Object journeyshopping;
        private Object journeyactivity;
        private Object journeysightself;
        private String serviceguideattrname;
        private String payname;
        private String paydate;
        private String teamtype;
        private String supplement;
        private String remarks;
        private String notice;
        private Object warning;
        private String islogicdelete;
        private String createuserid;
        private String createtime;
        private String timestamp;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLinesid() {
            return linesid;
        }

        public void setLinesid(String linesid) {
            this.linesid = linesid;
        }

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public String getLinesguid() {
            return linesguid;
        }

        public void setLinesguid(String linesguid) {
            this.linesguid = linesguid;
        }

        public String getAreascodesnames() {
            return areascodesnames;
        }

        public void setAreascodesnames(String areascodesnames) {
            this.areascodesnames = areascodesnames;
        }

        public String getLinesname() {
            return linesname;
        }

        public void setLinesname(String linesname) {
            this.linesname = linesname;
        }

        public String getJourneysight() {
            return journeysight;
        }

        public void setJourneysight(String journeysight) {
            this.journeysight = journeysight;
        }

        public String getServicegotrafficattrname() {
            return servicegotrafficattrname;
        }

        public void setServicegotrafficattrname(String servicegotrafficattrname) {
            this.servicegotrafficattrname = servicegotrafficattrname;
        }

        public String getGotostand() {
            return gotostand;
        }

        public void setGotostand(String gotostand) {
            this.gotostand = gotostand;
        }

        public String getServiceeatattrname() {
            return serviceeatattrname;
        }

        public void setServiceeatattrname(String serviceeatattrname) {
            this.serviceeatattrname = serviceeatattrname;
        }

        public String getServicelevelattrname() {
            return servicelevelattrname;
        }

        public void setServicelevelattrname(String servicelevelattrname) {
            this.servicelevelattrname = servicelevelattrname;
        }

        public Object getJourneyshopping() {
            return journeyshopping;
        }

        public void setJourneyshopping(Object journeyshopping) {
            this.journeyshopping = journeyshopping;
        }

        public Object getJourneyactivity() {
            return journeyactivity;
        }

        public void setJourneyactivity(Object journeyactivity) {
            this.journeyactivity = journeyactivity;
        }

        public Object getJourneysightself() {
            return journeysightself;
        }

        public void setJourneysightself(Object journeysightself) {
            this.journeysightself = journeysightself;
        }

        public String getServiceguideattrname() {
            return serviceguideattrname;
        }

        public void setServiceguideattrname(String serviceguideattrname) {
            this.serviceguideattrname = serviceguideattrname;
        }

        public String getPayname() {
            return payname;
        }

        public void setPayname(String payname) {
            this.payname = payname;
        }

        public String getPaydate() {
            return paydate;
        }

        public void setPaydate(String paydate) {
            this.paydate = paydate;
        }

        public String getTeamtype() {
            return teamtype;
        }

        public void setTeamtype(String teamtype) {
            this.teamtype = teamtype;
        }

        public String getSupplement() {
            return supplement;
        }

        public void setSupplement(String supplement) {
            this.supplement = supplement;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }

        public Object getWarning() {
            return warning;
        }

        public void setWarning(Object warning) {
            this.warning = warning;
        }

        public String getIslogicdelete() {
            return islogicdelete;
        }

        public void setIslogicdelete(String islogicdelete) {
            this.islogicdelete = islogicdelete;
        }

        public String getCreateuserid() {
            return createuserid;
        }

        public void setCreateuserid(String createuserid) {
            this.createuserid = createuserid;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }
    }

    public static class DataRelatedBean {
        /**
         * id : 13590
         * linesid : 13510
         * guid : ddc19cce-b357-4b1e-b751-3f3510670e11112752
         * linesguid : ddc19cce-b357-4b1e-b751-3f3510670e11
         * feature : \u2605\u4f4f\u5bbf\u5347\u7ea7\n\u5168\u7a0b\u6cf0\u5f0f\u4e94\u661f\u9152\u5e97\uff0c\u66fc\u8c37\u5347\u7ea71\u665a\u56fd\u9645\u4e94\u661f\u9152\u5e97\uff01\n\u2605\u884c\u7a0b\u5347\u7ea7\n\u5168\u7a0b\u76f4\u98de\u822a\u73ed\uff0c\u8212\u9002\u5b89\u5168\u3002\n\u8d85\u503c\u8d60\u9001\u4ef7\u503c1288\u5143\u666f\u70b9\u884c\u7a0b\n1.\u62c9\u739b\u7687\u671d\u5927\u7687\u5bab+\u7389\u4f5b\u5bfa\uff08\u6cf0\u56fd\u5730\u6807\u5f0f\u5efa\u7b51 \u91d1\u78a7\u8f89\u714c\uff09\n2.\u963f\u5357\u8fbe\u6c99\u739b\u7a7a\u7687\u5bb6\u5fa1\u4f1a\u9986 \n3.\u7545\u6e38\u6e44\u5357\u6cb3+\u6c34\u4e0a\u98ce\u60c5(\u4f53\u9a8c\u6cf0\u56fd\u6c34\u4e0a\u4eba\u5bb6\u7684\u98ce\u571f\u4eba\u60c5)\n4.\u5609\u5e74\u534e\u98ce\u6708\u6b65\u884c\u8857\uff08\u770b\u5c3d\u82ad\u5824\u96c5\u591c\u5e55\u4e0b\u7684\u94c5\u534e\uff09\n5.\u6b63\u5b97\u6cf0\u5f0f\u53e4\u6307\u538b\u6cd5\u6309\u6469\uff08\u8212\u7f13\u65c5\u9014\u75b2\u52b3\uff0c\u6b63\u70b9\uff09\n6.\u9a91\u5927\u8c61&\u9cc4\u9c7c\u8868\u6f14\n7.\u82ad\u5824\u96c5\u4e09\u5927\u5947\u89c2\uff08\u5927\u5343\u4e16\u754c\u65e0\u5947\u4e0d\u6709\uff09\n8.\u6cf0\u56fd\u56fd\u7cb9-\u4e1c\u65b9\/\u66b9\u7f57\u516c\u4e3b\u53f7\uff08\u4e0e\u4eba\u5996\u72c2\u6b22\u5171\u821e\uff09\n9.\u91d1\u6c99\u5c9b\n\u2605\u670d\u52a1\u5347\u7ea7\n\u5168\u7a0b\u65e0\u81ea\u8d39\u518d\u8d60\u9001\u6bcf\u4eba1000\u5143\u81ea\u8d39\u5238\uff08\u5982\u4e0d\u53c2\u52a0\uff0c\u89c6\u4e3a\u81ea\u52a8\u653e\u5f03\uff0c\u4e0d\u9000\u4e0d\u6362\uff09\n\u82ad\u63d0\u96c5\u592a\u5e73\u6d0b\u597d\u671b\u89d2\n\u4eba\u5996\u8868\u6f14\n\u70ed\u5e26\u6c34\u679c\u56ed\n\u68a6\u5e7b\u9b54\u672f\u5947\u89c2\u79c0\n\u5e1d\u738b\u9910\u2014\u9c7c\u7fc5\u71d5\u7a9d\n3D\u795e\u5947\u7535\u5f71\u738b\u56fd\u6216\u82ad\u5824\u96c5\u591c\u95f4\u8868\u6f14
         * feenotincluded : \u56e2\u8d39\u4e0d\u5305\u542b\uff1a\n1\u3001\u4e2a\u4eba\u62a4\u7167\u8d39\u7528\uff0c\u7b7e\u8bc1\u8d39\n2\u3001\u56fd\u5185\u6bb5\u4ea4\u901a\uff0c\u673a\u573a\u5f80\u8fd4\u9700\u81ea\u7406\u3002\n3\u3001\u822a\u7a7a\u4fdd\u9669\u4ee5\u53ca\u884c\u674e\u8d85\u91cd\u8d39\u7528\u53ca\u6d77\u5173\u8bfe\u7a0e\u3002\n4\u3001\u884c\u7a0b\u4ee5\u5916\u89c2\u5149\u8282\u76ee\u6216\u81ea\u8d39\u6d3b\u52a8\u9879\u76ee\u3002\n5\u3001\u5404\u56fd\u9152\u7c7b\u3001\u6c7d\u6c34\u3001\u6d17\u8863\u3001\u7535\u62a5\u3001\u7535\u8bdd\u53ca\u4e00\u5207\u79c1\u4eba\u6027\u8d28\u4e4b\u8d39\u7528\u3002\n6\u3001\u56e0\u7f62\u5de5\u3001\u53f0\u98ce\u3001\u822a\u73ed\u53d6\u6d88\u6216\u66f4\u6539\u65f6\u95f4\uff0c\u4ea4\u901a\u5ef6\u963b\u53ca\u5176\u5b83\u4e0d\u5728\u672c\u516c\u53f8\u63a7\u5236\u8303\u56f4\u5185\u60c5\u51b5\u6240\u5bfc\u81f4\u7684\u989d\u5916\u8d39\u7528\u3002\n7\u3001\u5355\u623f\u5dee\uff0c\u56e0\u51fa\u73b0\u5355\u7537\u5355\u5973\u6216\u8005\u5ba2\u4eba\u8981\u6c42\u4e00\u4eba\u4e00\u95f4\uff0c\u6216\u8005\u4e0d\u670d\u4ece\u9886\u961f\u6392\u623f\u7684\u9700\u8981\u652f\u4ed8\u5355\u623f\u5dee\n\n\u884c\u7a0b\u4ec5\u4f9b\u53c2\u8003\uff0c\u65c5\u884c\u793e\u5728\u4e0d\u51cf\u5c11\u884c\u7a0b\u7684\u524d\u63d0\u4e0b\uff0c\u4fdd\u7559\u4f9d\u636e\u5177\u4f53\u60c5\u51b5\u53d8\u66f4\u884c\u7a0b\u987a\u5e8f\u548c\u9152\u5e97\u7684\u6743\u5229\uff01\n\u4ee5\u4e0a\u822a\u73ed\u65f6\u95f4\u4e3a\u53c2\u8003\u822a\u73ed\u65f6\u95f4\uff0c\u5305\u673a\u6700\u7ec8\u65f6\u523b\u4ee5\u6c11\u822a\u5c40\u6279\u590d\u4e3a\u51c6\uff01\uff01\uff01\uff01
         * feeincluded : \u56e2\u8d39\u5305\u542b\uff1a\n1\u3001\u4ea4\u901a\uff1a \u56fd\u9645\u5f80\u8fd4\u673a\u7968\uff08\u542b\u7a0e\uff0c\u5305\u62ec\u56de\u7a0b\u673a\u573a\u7a0e\uff09\uff0c\u5f53\u5730\u7a7a\u8c03\u65c5\u6e38\u8f66\u3002\n2\u3001\u4f4f\u5bbf\uff1a\u884c\u7a0b\u4e2d\u53c2\u8003\u9152\u5e97\n3\u3001\u5bfc\u6e38\uff1a\u5f53\u5730\u4e2d\u6587\u5bfc\u6e38\u548c\u5916\u7c4d\u53f8\u673a\uff0c\u56fd\u5185\u9886\u961f\u5168\u7a0b\u8d34\u5fc3\u966a\u540c\u3002\n4\u3001\u884c\u7a0b\u53ca\u7528\u9910\uff1a\u884c\u7a0b\u4e2d\u6240\u5217\u666f\u70b9\u53ca\u7528\u9910\u3002\n5\u3001\u4fdd\u9669\uff1a\u65c5\u884c\u793e\u8d23\u4efb\u4fdd\u9669\uff0c\u5efa\u8bae\u81ea\u884c\u8d2d\u4e70\u4e2a\u4eba\u65c5\u6e38\u610f\u5916\u9669\u53ca\u822a\u7a7a\u9669\u3002
         * owncharge : null
         * notice : \u7b7e\u8bc1\u987b\u77e5\n\u529e\u7406\u7b7e\u8bc1\u6240\u9700\u6750\u6599\uff1a\u62a4\u7167\uff0c\u5fc5\u987b\u4fdd\u8bc1\u81ea\u51fa\u53d1\u65e5\u8d77\u67096\u4e2a\u6708\u4ee5\u4e0a\u6709\u6548\u671f\uff0c\u53ca\u8fde\u7eed\u4e24\u9875\u7a7a\u767d\u9875\u3002\n\u82e5\u56e0\u4ee5\u4e0a\u539f\u56e0\u5bfc\u81f4\u65e0\u6cd5\u51fa\u5883\u6216\u62d2\u7b7e\uff0c\u6211\u793e\u4e0d\u627f\u62c5\u4efb\u4f55\u8d23\u4efb\u3002\n\u53c2\u56e2\u987b\u77e5\n65\u5468\u5c81\u4ee5\u4e0a\u8001\u4eba\u8bf7\u63d0\u4f9b\u4e09\u7532\u533b\u9662\u5065\u5eb7\u8bc1\u660e\u548c\u5bb6\u5c5e\u966a\u540c\u4ee5\u53ca\u76f4\u7cfb\u5bb6\u5c5e\u7b7e\u7684\u514d\u8d23\u534f\u8bae\u65b9\u80fd\u53c2\u56e2\n\u8bf7\u4e8e\u5b9a\u4f4d\u786e\u8ba4\u540e2\u5929\u5185\u652f\u4ed8\u5b9a\u91d1\u4eba\u6c11\u5e013000\u5143\/\u4eba\uff0c\u65b9\u53ef\u786e\u5b9a\u7559\u4f4d\uff1b\u53e6\u5916\u8bf7\u4e8e\u51fa\u53d1\u524d\u81f3\u5c117\u4e2a\u5de5\u4f5c\u65e5\u652f\u4ed8\u5168\u6b3e\uff0c\u5426\u5219\u672c\u516c\u53f8\u6709\u6743\u53d6\u6d88\u5176\u5b9a\u4f4d\uff0c\u5df2\u4ed8\u4e4b\u5b9a\u91d1\u6055\u4e0d\u9000\u8fd8\u3002\n\u673a\u4f4d\u786e\u5b9a\u540e\uff0c\u51fa\u53d1\u524d7\u5929\u53d6\u6d88\uff0c\u6263\u9664\u5b9a\u91d1\u4eba\u6c11\u5e013000\u5143\/\u4eba\uff1b\u51fa\u53d1\u524d7\u5929\u81f3\u51fa\u53d1\u5f53\u65e5\u53d6\u6d88\uff0c\u6263\u9664100%\u5168\u6570\u56e2\u8d39\u3002\n\u5883\u5916\u5bfc\u6e38\u6709\u6743\u89c6\u5f53\u5730\u60c5\u51b5\u66f4\u6539\u884c\u7a0b\u53ca\u7528\u9910\u5730\u70b9\uff0c\u5982\u65e0\u4e0d\u53ef\u6297\u62d2\u56e0\u7d20\uff0c\u5c06\u4e0d\u51cf\u5c11\u884c\u7a0b\u4e0a\u6240\u6709\u666f\u70b9\u3002\u5883\u5916\u7684\u5f53\u5929\u884c\u7a0b\u5230\u9152\u5e97\u4f11\u606f\u4e3a\u6b62\uff0c\u5ba2\u4eba\u5982\u8981\u79c1\u81ea\u5916\u51fa\uff0c\u53d1\u751f\u4e00\u5207\u610f\u5916\uff0c\u5747\u4e0e\u65c5\u884c\u793e\u65e0\u5173\u3002\n\u4ee5\u4e0a\u884c\u7a0b\u4ec5\u4f9b\u53c2\u8003\uff0c\u6211\u793e\u6709\u6743\u5728\u4e0d\u51cf\u5c11\u666f\u70b9\u7684\u60c5\u51b5\u4e0b\uff0c\u6839\u636e\u5b9e\u9645\u60c5\u51b5\u53d8\u66f4\u666f\u70b9\u548c\u4f4f\u5bbf\u987a\u5e8f\u3002\n\u5168\u7a0b\u9152\u5e97\u4f4f\u5bbf\u5747\u4e3a\u53cc\u4eba\u6807\u51c6\u95f4\uff0c\u65e0\u81ea\u7136\u5355\u95f4\uff0c\u5982\u53c2\u56e2\u65f6\u6709\u5355\u7537\u5355\u5973\u4ee5\u52a0\u5e8a\u6216\u62fc\u623f\u4e3a\u4e3b\u3002\u5982\u8981\u6c42\u4f4f\u5355\u95f4\uff0c\u8bf7\u63d0\u524d\u544a\u77e5\uff0c\u5e76\u8865\u6536\u5355\u623f\u5dee\u3002\u5bf9\u4e8e\u9152\u5e97\u6709\u7279\u6b8a\u8981\u6c42\u7684\uff08\u5982\u8981\u6c42\u5927\u5e8a\u623f\u7b49\uff09\u8bf7\u4e8e\u53c2\u56e2\u65f6\u544a\u77e5\u3002\n\u6839\u636e\u300a\u65c5\u6e38\u6cd5\u300b\u89c4\u5b9a\uff0c\u65c5\u884c\u8005\u4e0d\u5f97\u8131\u56e2\uff0c\u5982\u64c5\u81ea\u8131\u56e2\u3001\u79bb\u56e2\u3001\u6ede\u7559\u7b49\uff0c\u65c5\u884c\u793e\u5c06\u5411\u516c\u5b89\u673a\u5173\u3001\u65c5\u6e38\u4e3b\u7ba1\u90e8\u95e8\u3001\u6211\u56fd\u9a7b\u5916\u673a\u6784\u62a5\u544a\uff0c\u7531\u6b64\u4ea7\u751f\u7684\u4e00\u5207\u6cd5\u5f8b\u540e\u679c\u7531\u65c5\u6e38\u8005\u627f\u62c5\u3002\n\u5e26\u56e2\u65f6\u5019\u5bfc\u6e38\u6709\u6743\u6839\u636e\u5b9e\u9645\u60c5\u51b5\u66f4\u6539\u6e38\u89c8\u987a\u5e8f\uff0c\u5982\u9047\u653f\u7b56\u6027\u539f\u56e0\u6216\u8005\u662f\u6574\u4fee\u7b49\u539f\u56e0\u9020\u6210\u7684\u90e8\u5206\u666f\u70b9\u65e0\u6cd5\u6e38\u89c8\u8d39\u7528\u6982\u4e0d\u9000\u8fd8\uff0c\u51c6\u786e\u884c\u7a0b\u4ee5\u51fa\u56e2\u901a\u77e5\u4e3a\u51c6\n\u6e29\u99a8\u63d0\u793a\n\u884c\u7a0b\u4e2d\u6240\u5217\u822a\u73ed\u53f7\u53ca\u65f6\u95f4\u4ec5\u4f9b\u53c2\u8003\uff0c\u5c06\u6839\u636e\u5b9e\u9645\u60c5\u51b5\u505a\u51fa\u5408\u7406\u7684\u8c03\u6574\u3002\n\u6b64\u53c2\u8003\u884c\u7a0b\u548c\u65c5\u6e38\u8d39\u7528\uff0c\u6211\u516c\u53f8\u5c06\u6839\u636e\u53c2\u56e2\u4eba\u6570\u3001\u822a\u73ed\u3001\u7b7e\u8bc1\u53ca\u76ee\u7684\u5730\u56fd\u4e34\u65f6\u53d8\u5316\u4fdd\u7559\u8c03\u6574\u7684\u6743\u5229\u3002\n\u8d35\u91cd\u7269\u54c1(\u73b0\u91d1\uff0c\u62a4\u7167\u7b49)\u8bf7\u968f\u8eab\u643a\u5e26\u6216\u5bc4\u653e\u5728\u4f4f\u5bbf\u996d\u5e97\u7684\u4fdd\u9669\u7bb1\u5185\uff0c\u7d76\u4e0d\u53ef\u653e\u5728\u8f66\u4e0a\u6216\u623f\u95f4\u5185\u7b49\uff0c\u5982\u6709\u9057\u5931\u65c5\u5ba2\u5fc5\u987b\u81ea\u884c\u8d1f\u8d23\uff0c\u4e0e\u63a5\u5f85\u65c5\u884c\u793e\u8d23\u4efb\u65e0\u5173\u3002\n\u4f4f\u5bbf\u996d\u5e97\u5185\u8bf7\u5148\u89c2\u5bdf\u7d27\u6025\u51fa\u53e3\u6240\u5728\uff0c\u82e5\u662f\u996d\u5e97\u8b66\u62a5\u94c3\u54cd\uff0c\u8bf7\u52ff\u614c\u5f20\u3002\u5e76\u8bf7\u7531\u7d27\u6025\u51fa\u53e3\u8fc5\u901f\u79bb\u5f00\u3002\u4f11\u606f\u65f6\u8bf7\u52a0\u6263\u623f\u95f4\u5185\u4e4b\u5b89\u5168\u9501\uff0c\u5bf9\u964c\u751f\u4eba\u4e0d\u8981\u4e71\u5f00\u95e8\u3002\u52ff\u5c06\u8863\u7269\u62ab\u6302\u5728\u996d\u5e97\u7684\u706f\u4e0a\uff0c\u53ca\u52ff\u5728\u5e8a\u4e0a\u62bd\u70df\uff0c\u70df\u8482\u4e0d\u80fd\u4e71\u4e22\uff0c\u4ee5\u9632\u9020\u6210\u706b\u707e\u5f62\u8d23\u6216\u996d\u5e97\u7269\u54c1\u635f\u574f\u800c\u8981\u6c42\u4f4f\u5ba2\u8d54\u8d4f\u3002\n\u996d\u5e97\u6e38\u6cf3\u6c60\u5982\u65f6\u95f4\u672a\u5f00\u653e\u53ca\u65e0\u6551\u751f\u4eba\u5458\u5728\u73b0\u573a\uff0c\u8bf7\u52ff\u81ea\u5165\u6cf3\u6c60\u5185\uff0c\u5426\u5219\u5982\u6709\u610f\u5916\u53d1\u751f\u987b\u81ea\u884c\u8d1f\u8d23\u3002\n\u642d\u4e58\u8239\u53ea\u6216\u4ece\u4e8b\u6c34\u4e0a\u6d3b\u52a8\u65f6\uff0c\u52a1\u5fc5\u7a7f\u4e0a\u6551\u751f\u8863\uff0c\u8239\u53ea\u884c\u8d70\u65f6\u8bf7\u52ff\u8d70\u52a8\uff0c\u5207\u52ff\u5c06\u624b\u6216\u811a\u653e\u7f6e\u8239\u8fb9\u53d7\u4f24\u3002\u6d77\u8fb9\u620f\u6c34\uff0c\u5207\u52ff\u8d85\u8fc7\u5b89\u5168\u8b66\u6212\u7ebf\u7684\u8303\u56f4\u3002\u6211\u4eec\u5fc5\u987b\u518d\u4e09\u58f0\u660e\uff1a\u53ea\u6709\u60a8\u6700\u4e86\u89e3\u672c\u8eab\u7684\u8eab\u4f53\u72b6\u51b5\uff0c\u5982\u5b55\u5987\uff0c\u5fc3\u810f\u75be\u75c5\u60a3\u8005\uff0c\u9ad8\u9f84\u8005\uff0c\u5e7c\u9f84\u8005\uff0c\u9ad8\u4f4e\u8840\u538b\u75c5\u60a3\u8005\uff0c\u6216\u4efb\u4f55\u4e0d\u9002\u5408\u5267\u70c8\u8fd0\u52a8\u4e4b\u75be\u75c5\u60a3\u8005\u7b49\uff0c\u7d76\u5bf9\u4e0d\u9002\u5408\u53c2\u52a0\u4efb\u4f55\u6c34\u4e0a\u6d3b\u52a8\u6216\u6d6e\u6f5c\u6216\u4e0d\u9002\u5e94\u4e8e\u60a8\u4e2a\u4eba\u4f53\u8d28\u4e4b\u5176\u5b83\u5267\u70c8\uff0c\u523a\u6fc0\u6027\u7684\u6d3b\u52a8\uff0c\u5982\u65c5\u5ba2\u9690\u7792\u4e2a\u4eba\u75be\u75c5\u6216\u575a\u6301\u53c2\u52a0\u4efb\u4f55\u6d3b\u52a8\u800c\u5f15\u81f4\u610f\u5916\uff0c\u4e00\u5207\u540e\u679c\u65c5\u5ba2\u81ea\u884c\u8d1f\u8d23\u3002\n\u4e0e\u91ce\u751f\u52a8\u7269\u5408\u7167\u65f6\uff0c\u5207\u52ff\u4f5c\u5f04\u6216\u62d4\u52a8\u7269\u987b\u6bdb\uff0c\u8bf7\u542c\u4ece\u9a6f\u517d\u5e08\u7684\u6307\u5bfc\uff0c\u4ee5\u514d\u56e0\u4eba\u4e3a\u56e0\u7d20\u800c\u53d1\u751f\u610f\u5916\u3002\n\u4e1c\u5357\u4e9a\u56e0\u5b63\u8282\u6027\u7684\u5173\u7cfb\uff0c\u96be\u514d\u5ba2\u4eba\u4f1a\u6709\u6c34\u571f\u4e0d\u670d\u5076\u5c14\u6cfb\u809a\u7684\u72b6\u51b5\uff0c\u8bf7\u5c3d\u91cf\u907f\u514d\u98df\u7528\u751f\u51b7\u98df\u7269\uff0c\u725b\u5976\uff0c\u6930\u5b50\uff0c\u51b0\u5757\u7b49\uff0c\u98df\u7269\u5c3d\u91cf\u719f\u98df\uff0c\u5982\u6709\u8179\u6cfb\u73b0\u8c61\u8bf7\u5c3d\u901f\u544a\u77e5\u5f53\u56e2\u9886\u961f\u6216\u5bfc\u6e38\uff0c\u4e0d\u8981\u81ea\u5df1\u4e71\u7528\u836f\u7269\u3002\n\u670d\u52a1\u6807\u51c6\u8bf4\u660e\n\u666f\u70b9\u8bf4\u660e\uff1a\u884c\u7a0b\u4e2d\u672a\u6807\u6ce8\u201c\u5165\u5185\u53c2\u89c2\u201d\u7684\u666f\u70b9\u5747\u4e3a\u6e38\u89c8\u5916\u89c2\uff1b\u5165\u5185\u53c2\u89c2\u666f\u70b9\u5747\u542b\u95e8\u7968\u3002\n\u884c\u7a0b\u8bf4\u660e\uff1a\u5982\u9047\u90e8\u5206\u666f\u70b9\u8282\u5047\u65e5\u4f11\u606f\u6216\u5e86\u5178\u7b49\uff0c\u672c\u793e\u6709\u6743\u6839\u636e\u5b9e\u9645\u60c5\u51b5\u8c03\u6574\u884c\u7a0b\u6e38\u89c8\u5148\u540e\u987a\u5e8f\uff0c\u4ee5\u5c3d\u53ef\u80fd\u4fdd\u8bc1\u6e38\u89c8\u5185\u5bb9\u3002\u4f46\u5ba2\u89c2\u56e0\u7d20\u9650\u5236\u786e\u5b9e\u65e0\u6cd5\u5b89\u6392\u7684\uff0c\u672c\u793e\u5c06\u6839\u636e\u5b9e\u9645\u60c5\u51b5\u8fdb\u884c\u8c03\u6574\uff0c\u656c\u8bf7\u5404\u4f4d\u8d35\u5bbe\u7406\u89e3\u4e0e\u914d\u5408\u3002\n\u6309\u7167\u4e1c\u5357\u4e9a\u9152\u5e97\u60ef\u4f8b\uff0c\u6bcf\u6807\u95f4\u53ef\u63a5\u5f85\u4e24\u5927\u4eba\u5e26\u4e00\u4e2a1.2\u7c73\u4ee5\u4e0b\u513f\u7ae5\uff08\u4e0d\u5360\u5e8a\uff09\uff0c\u5177\u4f53\u8d39\u7528\u6839\u636e\u6240\u62a5\u56e2\u961f\u60c5\u51b5\u800c\u5b9a\uff1b\u82e5\u4e00\u4e2a\u5927\u4eba\u5e26\u4e00\u4e2a1.2\u7c73\u4ee5\u4e0b\u513f\u7ae5\u53c2\u56e2\uff0c\u5efa\u8bae\u4f4f\u4e00\u6807\u95f4\uff0c\u4ee5\u514d\u7ed9\u5176\u4ed6\u6e38\u5ba2\u4f11\u606f\u9020\u6210\u4e0d\u4fbf\u3002\n\u5728\u4e1c\u5357\u4e9a\u56fd\u5bb6\u4eab\u53d7\u670d\u52a1\u5e94\u4ed8\u5c0f\u8d39\u7684\u89c2\u5ff5\u5df2\u6210\u4e3a\u5176\u6587\u5316\u7684\u4e00\u90e8\u5206\uff0c\u8bf7\u5c0a\u91cd\u5bfc\u6e38\u3001\u5730\u966a\u548c\u53f8\u673a\u7684\u670d\u52a1\uff0c\u6309\u60ef\u4f8b\u652f\u4ed8\u5c0f\u8d39\uff0c\u8c22\u8c22\u60a8\u7684\u7406\u89e3\u548c\u652f\u6301\u3002\n\u9000\u8d39\u8bf4\u660e\n\u5982\u9047\u5929\u6c14\u3001\u6218\u4e89\u3001\u7f62\u5de5\u3001\u5730\u9707\u7b49\u4eba\u529b\u4e0d\u53ef\u6297\u529b\u56e0\u7d20\u65e0\u6cd5\u6e38\u89c8\uff0c\u6211\u793e\u5c06\u6309\u7167\u65c5\u884c\u793e\u534f\u8bae\uff0c\u9000\u8fd8\u672a\u6e38\u89c8\u666f\u70b9\u95e8\u7968\u8d39\u7528\uff0c\u4f46\u8d60\u9001\u9879\u76ee\u8d39\u7528\u4e0d\u9000\uff1b\u6e38\u5ba2\u56e0\u4e2a\u4eba\u539f\u56e0\u4e34\u65f6\u81ea\u613f\u653e\u5f03\u6e38\u89c8\uff0c\u9152\u5e97\u4f4f\u5bbf\u3001\u9910\u3001\u8f66\u7b49\u8d39\u7528\u5747\u4e0d\u9000\u8fd8\u3002\n\u8865\u8d39\u8bf4\u660e\n\u5982\u9047\u822a\u7a7a\u516c\u53f8\u653f\u7b56\u6027\u8c03\u6574\u673a\u7968\u4ef7\u683c\uff0c\u8bf7\u6309\u89c4\u5b9a\u8865\u4ea4\u5dee\u4ef7\u3002\u673a\u7968\u4ef7\u683c\u4e3a\u56e2\u961f\u673a\u7968\uff0c\u4e0d\u5f97\u6539\u7b7e\u6362\u4eba\u9000\u7968\uff1b\n\u5982\u679c\u65c5\u6e38\u76ee\u7684\u5730\u56fd\u5bb6\u653f\u7b56\u6027\u8c03\u6574\u95e8\u7968\u6216\u5176\u4ed6\u76f8\u5173\u4ef7\u683c\uff0c\u8bf7\u6309\u89c4\u5b9a\u8865\u4ea4\u5dee\u4ef7\uff1b
         * tip : null
         * shopping : \u73e0\u5b9d\u5c55\u793a\u4e2d\u5fc3\uff08\u7ea690\u5206\u949f\uff09\n\u76ae\u9769\u5c55\u793a\u4e2d\u5fc3\uff08\u7ea660\u5206\u949f\uff09\n\u539f\u77f3\u6cf0\u4e1d\u9986\uff08\u7ea660\u5206\u949f\uff09\n\u71d5\u7a9d\u4e73\u80f6\u4e2d\u5fc3\uff08\u7ea660\u5206\u949f\uff09\n\u571f\u7279\u4ea7\u4f11\u606f\u7ad9\uff08\u7ea660\u5206\u949f\uff09\n\u6bd2\u86c7\u7814\u7a76\u4e2d\u5fc3\uff08\u7ea660\u5206\u949f\uff09
         * activityaddress : null
         * featureeat : null
         * remarks : (\u53c2\u8003\u9152\u5e97)\n\u66fc\u8c37\u5f53\u5730\u4e94\u661f\u9152\u5e97\nROYAL SUITE\uff08\u66fc\u8c37\u7687\u5bb6\u5957\u623f\u9152\u5e97\uff09 \nROYAL CITY\uff08\u57ce\u5e02\u7687\u5bb6\u9152\u5e97\uff09 \nPearl Resort & Hotel\uff08\u660e\u73e0\u5ea6\u5047\u9152\u5e97\uff09 \nMida Hotel Ngamwongwan Bangkok\uff08\u66fc\u8c37\u7eb3\u52a0\u9a6c\u7fc1\u4e07\u7c73\u8fbe\u9152\u5e97\uff09 \nRama Gardens Hotel Bangkok\uff08\u66fc\u8c37\u62c9\u739b\u82b1\u56ed\u9152\u5e97\uff09 \nMida Airport Hotel Bangkok(\u66fc\u8c37\u7f8e\u8fbe\u5eca\u66fc\u673a\u573a\u9152\u5e97)   \n\u6216\u540c\u7ea7\n\n\u82ad\u63d0\u96c5\u5f53\u5730\u4e94\u661f\u9152\u5e97\nD@Sea Hotel Pattaya\uff08\u82ad\u5824\u96c5\u6d77\u6d0bD\u9152\u5e97\uff09\nPrima Villa Hotel Pattaya\uff08\u82ad\u5824\u96c5\u666e\u745e\u739b\u522b\u5885\u9152\u5e97\uff09\nWoraburi The Ritz Resort & Spa Pattaya\uff08\u82ad\u63d0\u96c5\u6c83\u52d2\u5e03\u91cc\u4e3d\u5609\u5ea6\u5047\u6751\u53ca\u6c34\u7597\u4e2d\u5fc3\uff09\nVareena Palace Hotel\uff08\u74e6\u96f7\u7eb3\u7687\u5bab\u9152\u5e97\uff09\nLakkhana Poolside Resort Pattaya\uff08\u82ad\u5824\u96c5\u62c9\u5361\u7eb3\u6cf3\u6c60\u5ea6\u5047\u6751\uff09\nBalihai Bay Hotel Pattaya\uff08\u82ad\u5824\u96c5\u5df4\u91cc\u6d77\u6e7e\u9152\u5e97\uff09\n\u6216\u540c\u7ea7\n\n\u66fc\u8c37\u56fd\u9645\u4e94\u661f\u9152\u5e97\nThe Bazaar Hotel Bangkok (\u66fc\u8c37\u96c6\u5e02\u9152\u5e97)\nMontien Riverside Hotel\uff08\u8499\u5929\u6cb3\u7554\u9152\u5e97\uff09 \nThe Berkeley Hotel Pratunam(\u6c34\u95e8\u4f2f\u514b\u5229\u9152\u5e97)\nThe Grand Fourwings Convention Hotel Bangkok (\u66fc\u8c37\u98de\u8d8a\u5927\u9152\u5e97) \n Centara Grand at Central Plaza Ladprao Bangkok (\u66fc\u8c37\u76db\u6cf0\u6f9c\u62c9\u666e\u5d02\u4e2d\u592e\u5e7f\u573a\u9152\u5e97)\nPullman Bangkok King Power(\u66fc\u8c37\u94c2\u5c14\u66fc\u7687\u6743\u9152\u5e97) \nMovenpick Hotel Bangkok (\u745e\u4eab\u9152\u5e97)\nChatrium Hotel Riverside Bangkok(\u66fc\u8c37\u5bdf\u6bbf\u6cb3\u7554\u8c6a\u534e\u9152\u5e97) \n\u6216\u540c\u7ea7
         * createuserid : 10274
         * createtime : 2017-01-24 15:57:00
         * timestamp : 2017-01-24 16:15:08
         * islogicdelete : 1
         */

        private String id;
        private String linesid;
        private String guid;
        private String linesguid;
        private String feature;
        private String feenotincluded;
        private String feeincluded;
        private String owncharge;
        private String notice;
        private String tip;
        private String shopping;
        private Object activityaddress;
        private Object featureeat;
        private String remarks;
        private String createuserid;
        private String createtime;
        private String timestamp;
        private String islogicdelete;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLinesid() {
            return linesid;
        }

        public void setLinesid(String linesid) {
            this.linesid = linesid;
        }

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public String getLinesguid() {
            return linesguid;
        }

        public void setLinesguid(String linesguid) {
            this.linesguid = linesguid;
        }

        public String getFeature() {
            return feature;
        }

        public void setFeature(String feature) {
            this.feature = feature;
        }

        public String getFeenotincluded() {
            return feenotincluded;
        }

        public void setFeenotincluded(String feenotincluded) {
            this.feenotincluded = feenotincluded;
        }

        public String getFeeincluded() {
            return feeincluded;
        }

        public void setFeeincluded(String feeincluded) {
            this.feeincluded = feeincluded;
        }

        public String getOwncharge() {
            return owncharge;
        }

        public void setOwncharge(String owncharge) {
            this.owncharge = owncharge;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }

        public String getTip() {
            return tip;
        }

        public void setTip(String tip) {
            this.tip = tip;
        }

        public String getShopping() {
            return shopping;
        }

        public void setShopping(String shopping) {
            this.shopping = shopping;
        }

        public Object getActivityaddress() {
            return activityaddress;
        }

        public void setActivityaddress(Object activityaddress) {
            this.activityaddress = activityaddress;
        }

        public Object getFeatureeat() {
            return featureeat;
        }

        public void setFeatureeat(Object featureeat) {
            this.featureeat = featureeat;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public String getCreateuserid() {
            return createuserid;
        }

        public void setCreateuserid(String createuserid) {
            this.createuserid = createuserid;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getIslogicdelete() {
            return islogicdelete;
        }

        public void setIslogicdelete(String islogicdelete) {
            this.islogicdelete = islogicdelete;
        }
    }

    public static class DataServiceBean {
        /**
         * id : 8446
         * linesid : 13510
         * guid : ddc19cce-b357-4b1e-b751-3f3510670e1136834
         * linesguid : ddc19cce-b357-4b1e-b751-3f3510670e11
         * service_attrid : 1
         * service_levelattrname : \u6807\u51c6\u7b49
         * service_eatattrname : \u81ea\u5b9a\u4e49
         * service_liveattrname : \u53cc\u4eba\u6807\u51c6\u95f4
         * service_gotrafficattrname : \u98de\u673a
         * service_backtrafficattrname : \u98de\u673a
         * service_sighttrafficattrname : null
         * service_insuranceattrname : 30\u4e07\u5143\u51fa\u5883\u65c5\u6e38\u610f\u5916\u4f24\u5bb3\u9669(40\u5143 \/\u4eba)
         * service_sightattrname : \u542b\u884c\u7a0b\u5185\u975e\u81ea\u8d39\u666f\u70b9\u7b2c\u4e00\u5927\u95e8\u7968
         * service_guideattrname : \u5168\u7a0b\u5bfc\u6e38\u670d\u52a1
         * islogicdelete : 1
         * createtime : 2017-01-24 15:57:00
         * createuserid : 10274
         * timestamp : 0000-00-00 00:00:00
         */

        private String id;
        private String linesid;
        private String guid;
        private String linesguid;
        private String service_attrid;
        private String service_levelattrname;
        private String service_eatattrname;
        private String service_liveattrname;
        private String service_gotrafficattrname;
        private String service_backtrafficattrname;
        private Object service_sighttrafficattrname;
        private String service_insuranceattrname;
        private String service_sightattrname;
        private String service_guideattrname;
        private String islogicdelete;
        private String createtime;
        private String createuserid;
        private String timestamp;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLinesid() {
            return linesid;
        }

        public void setLinesid(String linesid) {
            this.linesid = linesid;
        }

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public String getLinesguid() {
            return linesguid;
        }

        public void setLinesguid(String linesguid) {
            this.linesguid = linesguid;
        }

        public String getService_attrid() {
            return service_attrid;
        }

        public void setService_attrid(String service_attrid) {
            this.service_attrid = service_attrid;
        }

        public String getService_levelattrname() {
            return service_levelattrname;
        }

        public void setService_levelattrname(String service_levelattrname) {
            this.service_levelattrname = service_levelattrname;
        }

        public String getService_eatattrname() {
            return service_eatattrname;
        }

        public void setService_eatattrname(String service_eatattrname) {
            this.service_eatattrname = service_eatattrname;
        }

        public String getService_liveattrname() {
            return service_liveattrname;
        }

        public void setService_liveattrname(String service_liveattrname) {
            this.service_liveattrname = service_liveattrname;
        }

        public String getService_gotrafficattrname() {
            return service_gotrafficattrname;
        }

        public void setService_gotrafficattrname(String service_gotrafficattrname) {
            this.service_gotrafficattrname = service_gotrafficattrname;
        }

        public String getService_backtrafficattrname() {
            return service_backtrafficattrname;
        }

        public void setService_backtrafficattrname(String service_backtrafficattrname) {
            this.service_backtrafficattrname = service_backtrafficattrname;
        }

        public Object getService_sighttrafficattrname() {
            return service_sighttrafficattrname;
        }

        public void setService_sighttrafficattrname(Object service_sighttrafficattrname) {
            this.service_sighttrafficattrname = service_sighttrafficattrname;
        }

        public String getService_insuranceattrname() {
            return service_insuranceattrname;
        }

        public void setService_insuranceattrname(String service_insuranceattrname) {
            this.service_insuranceattrname = service_insuranceattrname;
        }

        public String getService_sightattrname() {
            return service_sightattrname;
        }

        public void setService_sightattrname(String service_sightattrname) {
            this.service_sightattrname = service_sightattrname;
        }

        public String getService_guideattrname() {
            return service_guideattrname;
        }

        public void setService_guideattrname(String service_guideattrname) {
            this.service_guideattrname = service_guideattrname;
        }

        public String getIslogicdelete() {
            return islogicdelete;
        }

        public void setIslogicdelete(String islogicdelete) {
            this.islogicdelete = islogicdelete;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getCreateuserid() {
            return createuserid;
        }

        public void setCreateuserid(String createuserid) {
            this.createuserid = createuserid;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }
    }

    public static class DataJourneyBean {
        /**
         * id : 65527
         * linesid : 13510
         * guid : ddc19cce-b357-4b1e-b751-3f3510670e11418103
         * linesguid : ddc19cce-b357-4b1e-b751-3f3510670e11
         * journey_day : 1
         * journey_details : \u6e38\u5ba2\u6839\u636e\u822a\u73ed\u65f6\u95f4\u524d\u5f80\u5e38\u5dde\u5954\u725b\u673a\u573a\uff0c\u7ec8\u4e8e\u5982\u7ea6\u642d\u4e58\u98de\u673a\uff0c\u968f\u5373\u4e58\u673a\u98de\u5f80\u6cf0\u56fd\u9996\u90fd\u66fc\u8c37\uff0c\u62b5\u8fbe\u540e\u4e13\u8f66\u9001\u5f80\u9152\u5e97\u4f11\u606f\uff0c\u4ee5\u5907\u4e4b\u540e\u7cbe\u5f69\u7eb7\u5448\u7684\u6cf0\u56fd\u4e4b\u65c5\u3002
         * journey_basic_info : \u5e38\u5dde[plane]\u66fc\u8c37 \u53c2\u8003\u822a\u73ed\uff1aSL8049 19:00-22:45
         * journey_break_fast : \u656c\u8bf7\u81ea\u7406
         * journey_lunch : \u656c\u8bf7\u81ea\u7406
         * journey_dinner : \u656c\u8bf7\u81ea\u7406
         * journey_lodging : \u66fc\u8c37\u5f53\u5730\u4e94\u661f\u9152\u5e97
         * journey_day_sight : null
         * journey_day_shopping : null
         * journey_day_sightself : null
         * journey_day_activity : null
         * createuserid : 10274
         * createtime : 2017-01-24 15:57:00
         * timestamp : 0000-00-00 00:00:00
         * islogicdelete : 1
         * journey_details_listall : []
         */

        private String id;
        private String linesid;
        private String guid;
        private String linesguid;
        private String journey_day;
        private String journey_details;
        private String journey_basic_info;
        private String journey_break_fast;
        private String journey_lunch;
        private String journey_dinner;
        private String journey_lodging;
        private Object journey_day_sight;
        private Object journey_day_shopping;
        private Object journey_day_sightself;
        private Object journey_day_activity;
        private String createuserid;
        private String createtime;
        private String timestamp;
        private String islogicdelete;
        private List<?> journey_details_listall;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLinesid() {
            return linesid;
        }

        public void setLinesid(String linesid) {
            this.linesid = linesid;
        }

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public String getLinesguid() {
            return linesguid;
        }

        public void setLinesguid(String linesguid) {
            this.linesguid = linesguid;
        }

        public String getJourney_day() {
            return journey_day;
        }

        public void setJourney_day(String journey_day) {
            this.journey_day = journey_day;
        }

        public String getJourney_details() {
            return journey_details;
        }

        public void setJourney_details(String journey_details) {
            this.journey_details = journey_details;
        }

        public String getJourney_basic_info() {
            return journey_basic_info;
        }

        public void setJourney_basic_info(String journey_basic_info) {
            this.journey_basic_info = journey_basic_info;
        }

        public String getJourney_break_fast() {
            return journey_break_fast;
        }

        public void setJourney_break_fast(String journey_break_fast) {
            this.journey_break_fast = journey_break_fast;
        }

        public String getJourney_lunch() {
            return journey_lunch;
        }

        public void setJourney_lunch(String journey_lunch) {
            this.journey_lunch = journey_lunch;
        }

        public String getJourney_dinner() {
            return journey_dinner;
        }

        public void setJourney_dinner(String journey_dinner) {
            this.journey_dinner = journey_dinner;
        }

        public String getJourney_lodging() {
            return journey_lodging;
        }

        public void setJourney_lodging(String journey_lodging) {
            this.journey_lodging = journey_lodging;
        }

        public Object getJourney_day_sight() {
            return journey_day_sight;
        }

        public void setJourney_day_sight(Object journey_day_sight) {
            this.journey_day_sight = journey_day_sight;
        }

        public Object getJourney_day_shopping() {
            return journey_day_shopping;
        }

        public void setJourney_day_shopping(Object journey_day_shopping) {
            this.journey_day_shopping = journey_day_shopping;
        }

        public Object getJourney_day_sightself() {
            return journey_day_sightself;
        }

        public void setJourney_day_sightself(Object journey_day_sightself) {
            this.journey_day_sightself = journey_day_sightself;
        }

        public Object getJourney_day_activity() {
            return journey_day_activity;
        }

        public void setJourney_day_activity(Object journey_day_activity) {
            this.journey_day_activity = journey_day_activity;
        }

        public String getCreateuserid() {
            return createuserid;
        }

        public void setCreateuserid(String createuserid) {
            this.createuserid = createuserid;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getIslogicdelete() {
            return islogicdelete;
        }

        public void setIslogicdelete(String islogicdelete) {
            this.islogicdelete = islogicdelete;
        }

        public List<?> getJourney_details_listall() {
            return journey_details_listall;
        }

        public void setJourney_details_listall(List<?> journey_details_listall) {
            this.journey_details_listall = journey_details_listall;
        }
    }

    public static class DataShowBean {
        /**
         * id : 31401
         * typeid : 2
         * title : \u5927\u7687\u5bab\uff0c\u7389\u4f5b\u5bfa\uff0c\u6e44\u5357\u6cb3\u6c34\u4e0a\u5e02\u573a\uff0c\u963f\u5357\u8fbe
         * content :
         * pic_data : [{"link_title":"\\u6d77\\u6ee8\\u52b1\\u5fd7\\u590f\\u7acb\\u8425","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u6d77\\u6ee8\\u52b1\\u5fd7\\u590f\\u7acb\\u8425","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16769\\/45afd3b879d013d1ddd4a9baa88a9702.png","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16769\\/45afd3b879d013d1ddd4a9baa88a9702.png"},{"link_title":"\\u79e6\\u7687\\u6c42\\u4ed9\\u5165\\u6d77\\u5904","link_sort":"0","city_id":"0","cover":"0","img_name":"\\u79e6\\u7687\\u6c42\\u4ed9\\u5165\\u6d77\\u5904","img_onlineurl":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16306\\/e56f4470b16a711823c24c8151ac7fca.jpg","img_url":"http:\\/\\/img1.uu1.com\\/images\\/0\\/14\\/16306\\/e56f4470b16a711823c24c8151ac7fca.jpg"}]
         */

        private String id;
        private String typeid;
        private String title;
        private String content;
        private List<PicDataBean> pic_data;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTypeid() {
            return typeid;
        }

        public void setTypeid(String typeid) {
            this.typeid = typeid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public List<PicDataBean> getPic_data() {
            return pic_data;
        }

        public void setPic_data(List<PicDataBean> pic_data) {
            this.pic_data = pic_data;
        }

        public static class PicDataBean {
            /**
             * link_title : \u6d77\u6ee8\u52b1\u5fd7\u590f\u7acb\u8425
             * link_sort : 0
             * city_id : 0
             * cover : 0
             * img_name : \u6d77\u6ee8\u52b1\u5fd7\u590f\u7acb\u8425
             * img_onlineurl : http:\/\/img1.uu1.com\/images\/0\/14\/16769\/45afd3b879d013d1ddd4a9baa88a9702.png
             * img_url : http:\/\/img1.uu1.com\/images\/0\/14\/16769\/45afd3b879d013d1ddd4a9baa88a9702.png
             */

            private String link_title;
            private String link_sort;
            private String city_id;
            private String cover;
            private String img_name;
            private String img_onlineurl;
            private String img_url;

            public String getLink_title() {
                return link_title;
            }

            public void setLink_title(String link_title) {
                this.link_title = link_title;
            }

            public String getLink_sort() {
                return link_sort;
            }

            public void setLink_sort(String link_sort) {
                this.link_sort = link_sort;
            }

            public String getCity_id() {
                return city_id;
            }

            public void setCity_id(String city_id) {
                this.city_id = city_id;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getImg_name() {
                return img_name;
            }

            public void setImg_name(String img_name) {
                this.img_name = img_name;
            }

            public String getImg_onlineurl() {
                return img_onlineurl;
            }

            public void setImg_onlineurl(String img_onlineurl) {
                this.img_onlineurl = img_onlineurl;
            }

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }
        }
    }

    public static class DataImgBean {
        /**
         * link_title : \u5b9d\u6e90\u8001\u918b\u574a
         * link_sort : 0
         * city_id : 0
         * cover : 0
         * img_name : \u5b9d\u6e90\u8001\u918b\u574a
         * img_onlineurl : http:\/\/img1.uu1.com\/images\/0\/14\/7472\/8951732c65ddfdfd639443f6d621cdc5.jpg
         * img_url : http:\/\/img1.uu1.com\/images\/0\/14\/7472\/8951732c65ddfdfd639443f6d621cdc5.jpg
         */

        private String link_title;
        private String link_sort;
        private String city_id;
        private String cover;
        private String img_name;
        private String img_onlineurl;
        private String img_url;

        public String getLink_title() {
            return link_title;
        }

        public void setLink_title(String link_title) {
            this.link_title = link_title;
        }

        public String getLink_sort() {
            return link_sort;
        }

        public void setLink_sort(String link_sort) {
            this.link_sort = link_sort;
        }

        public String getCity_id() {
            return city_id;
        }

        public void setCity_id(String city_id) {
            this.city_id = city_id;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getImg_name() {
            return img_name;
        }

        public void setImg_name(String img_name) {
            this.img_name = img_name;
        }

        public String getImg_onlineurl() {
            return img_onlineurl;
        }

        public void setImg_onlineurl(String img_onlineurl) {
            this.img_onlineurl = img_onlineurl;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }
    }
}
