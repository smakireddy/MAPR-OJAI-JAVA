# Create MapR DB JSON Table

maprcli table create -path /user/mapr/chicos/house -tabletype json

maprcli table cf edit -path /user/mapr/chicos/house -cfname default -readperm p -writeperm p -traverseperm  p



mapr importJSON -idfield '_id' -mapreduce false -src /user/mapr/house_json_data* -dst /user/mapr/chicos/house







vi house_json_data.json


maprcli table create -path /user/mapr/chicos/customer -tabletype json


maprcli table cf edit -path /user/mapr/chicos/customer -cfname default -readperm p -writeperm p -traverseperm  p


mapr importJSON -idfield '_id' -mapreduce false -src /user/mapr/sample_customer_chicos.json -dst /user/mapr/chicos/customer




mapr dbshell commands
***********************

maprdb mapr:> find /user/mapr/chicos/house --id "1+123401565"

maprdb mapr:> find /user/mapr/chicos/house --id "1+123401565" --f 'newColumn'

maprdb mapr:> find /user/mapr/chicos/customer --id "1+55003057" --f "_id,birth_month,last_name,contact_mail_pii[0].date_valid_to"

maprdb mapr:> find /user/mapr/chicos/customer --id "1+55003057" --f "_id,birth_month,last_name,contact_mail_pii[0].date_valid_to,contact_mail_pii[0].opt_out,customer_loyalty[0].loyalty_type.loyalty_type_desc"




select * from