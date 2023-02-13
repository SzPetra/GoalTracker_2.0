import React, { useEffect, useState } from "react";

const LandingPage = () => {
    const [punchline, setPunchline] = useState([]);

	useEffect(() => {
		const fetchData = async () => {
			try{
				const response = await fetch('https://dad-jokes.p.rapidapi.com/random/joke', {
					method: 'GET',
					headers: {
						'X-RapidAPI-Key': 'a31e9338e3mshd2df809b1e4940cp1d97bejsn3a035b596426',
						'X-RapidAPI-Host': 'dad-jokes.p.rapidapi.com'
			}
				});
				const json = await response.json();
				console.log(json);
				setPunchline(json.slip.punchline);
				console.log(punchline);
			} catch(error) {
				console.log("error", error);
			}
		}

		fetchData();
	}, []);

    return (
        <p>this is the landing page {punchline}</p>
    )
}

export default LandingPage;