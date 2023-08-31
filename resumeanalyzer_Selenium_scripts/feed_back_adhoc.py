from lib2to3.pgen2 import driver
from lib2to3.pgen2.driver import Driver
from turtle import onclick
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait as wait
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.keys import Keys
import time
import random
import string

# typing_speed = 0.5
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))

url = "http://ccv1dev101.dataflightit.com/rw/service/adhoc/submit-request"

browser = driver.maximize_window()
browser = driver.get(url)
time.sleep(5)
print(driver.title)

first_name = ["Kai", "Hunter", "Luca", "Quinn", "River", "Skylar", "Hayden"]
last_name = ["James", "Doha", "Harden", "Jordan", "Bryant", "Williams", "Simmons"]
email = ["kai@gmail.com", "hunter@gmail.com", "luca@gmail.com", "quinn@gmail.com", "River@gmail.com", "Skylar@gmail.com", "Hayden@gmail.com"]
rand = random.randint(0, 6)
random_first_name = first_name[rand]
random_last_name = last_name[rand]
random_email = email[rand]
ran = ''.join(random.choices(string.ascii_letters + string.digits, k=100))
print(ran)
print(random_first_name)
print(random_last_name)
print(random_email)
target_job1 = driver.find_element(By.XPATH,"/html/body/section/div/div[3]/div[2]/form/div[1]/div/div/div[1]/div/div/textarea")
target_job1.click()
target_job1.send_keys(ran)
time.sleep(5)
target_job2 = driver.find_element(By.XPATH,"/html/body/section/div/div[3]/div[2]/form/div[1]/div/div/div[2]/div/div/textarea")
target_job2.click()
target_job2.send_keys(ran)
time.sleep(5)
message1 = driver.find_element(By.XPATH,"/html/body/section/div/div[3]/div[2]/form/div[2]/div/div[1]/div/div/div/textarea")
message1.click()
message1.send_keys(ran)
time.sleep(5)
message2 = driver.find_element(By.XPATH,"/html/body/section/div/div[3]/div[2]/form/div[2]/div/div[2]/div/div/div/textarea")
message2.click()
message2.send_keys(ran)
time.sleep(5)
file_upload = driver.find_element(By.XPATH,"/html/body/section/div/div[3]/div[2]/form/div[3]/div/div/div/div/div/input")
file = "E://Selenium/sadiq.docx"
file_upload.send_keys(file)
i = random.randint(2, 4)
select_option = driver.find_element(By.XPATH,f"/html/body/section/div/div[3]/div[2]/form/div[4]/div/div/div/div/div/select/option[{i}]")
select_option.click()
time.sleep(5)
name_first = driver.find_element(By.XPATH,"/html/body/section/div/div[3]/div[2]/form/div[5]/div/div[1]/div[1]/div/div/input")
name_first.click()
name_first.send_keys(random_first_name)
time.sleep(5)
name_last = driver.find_element(By.XPATH,"/html/body/section/div/div[3]/div[2]/form/div[5]/div/div[1]/div[2]/div/div/input")
name_last.click()
name_last.send_keys(random_last_name)
time.sleep(5)
email_address = driver.find_element(By.XPATH,"/html/body/section/div/div[3]/div[2]/form/div[5]/div/div[2]/div/div/div/input")
email_address.click()
email_address.send_keys(random_email)
time.sleep(5)
submit = driver.find_element(By.XPATH,"/html/body/section/div/div[3]/div[2]/form/button")
submit.click()
time.sleep(10)