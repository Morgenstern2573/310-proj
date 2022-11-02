import requests
from urllib.parse import quote_plus

# outline main function
def main():
    # accept keyword from the user
    query = quote_plus(input("Enter space-separated keywords").strip())
    # use keyword to make API call with requests
    path = f"https://www.googleapis.com/customsearch/v1?key=AIzaSyC9-yThffMzzsDYcQN7aZZUyVtre8bySsU&cx=93b7cb032f56c40e2&q={query}"
    resp = requests.get(path)

    resp.raise_for_status()

    if resp.status_code != 200:
        print('Something went wrong with the API call')
        return
    # parse the JSON the api returns
    data = resp.json()
    print(data) 
    # store the urls in dictionary
    # use beautiful soup & requests to 
    # get website content and store in dictionary
    # make scraping process concurrent
    # hand over to ayo
    pass

if __name__ == "__main__":
    main()