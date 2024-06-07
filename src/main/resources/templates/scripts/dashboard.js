const REFRESH_RATE = 2000; // milliseconds
const MAX_DATA_POINTS = 20;

let interfaceTrafficChart;

function initializeOrUpdateChart() {
    var ctx = document.getElementById('interfaceTrafficChart').getContext('2d');

    if (!interfaceTrafficChart) {
        interfaceTrafficChart = new Chart(ctx, {
            type: 'line',
            data: {
                labels: [],
                datasets: [{
                    label: 'Interface Traffic Data',
                    data: [],
                    borderColor: 'rgba(75, 192, 192, 1)',
                    backgroundColor: 'rgba(75, 192, 192, 0.2)',
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    x: {
                        type: 'realtime',
                        realtime: {
                            duration: 20000,
                            refresh: 2000,
                            delay: 2000
                        }
                    },
                    y: {
                        beginAtZero: false
                    }
                }
            }
        });
    }

    updateInterfaceTrafficData(interfaceTrafficChart);
}

function updateInterfaceTrafficData(chart) {
    fetch('/interface-traffic-data')
        .then(response => response.json())
        .then(data => {
            var now = Date.now();
            var dataset = chart.data.datasets[0];

            dataset.data.push({
                x: now,
                y: data.interfaceTraffic
            });

            while (dataset.data.length > MAX_DATA_POINTS && dataset.data[0].x < now - 20000) {
                dataset.data.shift();
            }

            chart.update('quiet');
        })
        .catch(error => {
            console.error('Error fetching interface traffic data:', error);
        });
}

setInterval(initializeOrUpdateChart, REFRESH_RATE);
initializeOrUpdateChart();