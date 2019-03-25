# Create MapR DB JSON Table

maprcli table create -path /user/mapr/chicos/house -tabletype json

maprcli table cf edit -path /user/mapr/chicos/house -cfname default -readperm p -writeperm p -traverseperm  p



mapr importJSON -idfield '_id' -mapreduce false -src /user/mapr/house_json_data* -dst /user/mapr/chicos/house







vi house_json_data.json


maprcli table create -path /user/mapr/chicos/customer -tabletype json


maprcli table cf edit -path /user/mapr/chicos/customer -cfname default -readperm p -writeperm p -traverseperm  p


mapr importJSON -idfield '_id' -mapreduce false -src /user/mapr/sample_customer_chicos.json -dst /user/mapr/chicos/customer


