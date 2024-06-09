const REFRESH_RATE = 5000; // milliseconds
const MAX_DATA_POINTS = 20;

let interfaceTrafficChart, networkDevicesStatusChart;

function initializeCharts() {
    const ctxInterfaceTraffic = document.getElementById('interfaceTrafficChart').getContext('2d');
    const ctxNetworkDevicesStatus = document.getElementById('networkDevicesStatusChart').getContext('2d');

    interfaceTrafficChart = new Chart(ctxInterfaceTraffic, {
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

    networkDevicesStatusChart = new Chart(ctxNetworkDevicesStatus, {
        type: 'doughnut',
        data: {
            labels: ['Up', 'Down'],
            datasets: [{
                label: 'Devices Status',
                data: [0, 0],
                backgroundColor: ['rgba(40, 167, 69, 0.6)', 'rgba(220, 53, 69, 0.6)'],
                borderColor: ['rgba(40, 167, 69, 1)', 'rgba(220, 53, 69, 1)'],
                borderWidth: 1
            }]
        },
        options: {
            cutout: '50%'
        }
    });
}

function generateRandomData() {
    const now = Date.now();
    const trafficData = Math.floor(Math.random() * 100);

    // Interface Traffic Data
    const trafficDataset = interfaceTrafficChart.data.datasets[0];
    trafficDataset.data.push({ x: now, y: trafficData });
    while (trafficDataset.data.length > MAX_DATA_POINTS) {
        trafficDataset.data.shift();
    }
    interfaceTrafficChart.update('quiet');

    // Network Devices Status
    const upDevices = Math.floor(Math.random() * 100);
    const downDevices = Math.floor(Math.random() * 20);
    networkDevicesStatusChart.data.datasets[0].data = [upDevices, downDevices];
    networkDevicesStatusChart.update('quiet');

    // Traffic Alerts
    const trafficAlertsList = document.getElementById('trafficAlertsList');
    if (trafficData > 80) {
        const alertItem = document.createElement('li');
        alertItem.textContent = `High traffic detected: ${trafficData}% at ${new Date().toLocaleTimeString()}`;
        trafficAlertsList.appendChild(alertItem);
    }

    // Network Logs
    const networkLogsList = document.getElementById('networkLogsList');
    const logItem = document.createElement('li');
    logItem.textContent = `Log entry at ${new Date().toLocaleTimeString()}: Random event ${Math.floor(Math.random() * 1000)}`;
    networkLogsList.appendChild(logItem);
    if (networkLogsList.childNodes.length > 10) {
        networkLogsList.removeChild(networkLogsList.firstChild);
    }

    // Interfaces Down
    const interfacesDownList = document.getElementById('interfacesDownList');
    interfacesDownList.innerHTML = '';
    for (let i = 0; i < downDevices; i++) {
        const downInterfaceItem = document.createElement('li');
        downInterfaceItem.textContent = `Interface ${i + 1} down on Device ${Math.floor(Math.random() * 100)}`;
        interfacesDownList.appendChild(downInterfaceItem);
    }
}

initializeCharts();
setInterval(generateRandomData, REFRESH_RATE);